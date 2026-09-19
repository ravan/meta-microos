SUMMARY = "Low Complexity Communication Codec (LC3) - Shared library"
DESCRIPTION = "Low Complexity Communication Codec (LC3). \
The LC3 is an low latency audio codec. \
 \
This package provides the shared library of liblc3."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "liblc3-1-1.1.3-1.7.aarch64.rpm"
RPM_HASH = "d1157a883c7ce7b8f88d3d60c9bf4942db2db1120070eaa0ab129771639519ad27bbd2ebde75b693d0b34bd5eb0356f47a9914a9cdd5bcf4fe9c30bfcd93e0b7"

RPROVIDES:${PN} += "liblc3-1 \
liblc3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
