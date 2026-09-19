SUMMARY = "A wrapper for the SLICOT control and systems library"
DESCRIPTION = "Slycot is a wrapper for the SLICOT control and systems library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.7.0"

RPM_NAME = "python313-slycot-0.7.0-2.1.aarch64.rpm"
RPM_HASH = "e0217fff76fbb8426b96a57f4b29f0cd64ecd58f1a07fc8af8f77528d87e16a0460006b2443ec5259c3ee3cda8984a05245f7bd9a483e0c5a6c05898ca4d18ca"

RPROVIDES:${PN} += "python3-slycot \
python3.13dist-slycot \
python313-slycot \
python3dist-slycot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
python-abi \
python313-numpy"

inherit rpm
