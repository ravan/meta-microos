SUMMARY = "Tools to use the Bauer stereophonic-to-binaural DSP"
DESCRIPTION = "Tools (bs2bconvert and bs2bstream) to use the Bauer stereophonic-to-binaural \
DSP."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "bs2b-tools-3.1.0-14.11.aarch64.rpm"
RPM_HASH = "ba5909e8ec3b9c949a86f030f5c26b2179fc51a7b5aec34083f3e201857165eefc4e2e2b46663cf26f09e78376b530f4f8bfcfd63d88660b2155d87a1cf1059c"

RPROVIDES:${PN} += "bs2b-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbs2b.so.0 \
libc.so.6 \
libsndfile.so.1"

inherit rpm
