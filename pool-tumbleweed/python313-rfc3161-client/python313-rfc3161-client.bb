SUMMARY = "Python library implementing the Time-Stamp Protocol (TSP) described in RFC 3161"
DESCRIPTION = "rfc3161-client is a Python library implementing the Time-Stamp \
Protocol (TSP) described in RFC 3161."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "python313-rfc3161-client-1.0.6-1.6.aarch64.rpm"
RPM_HASH = "78ac54e59367aa844f9699ab26268cd3fcb4f01f778d2f54c0b5d777a9b97d38f1db743fd2695c1261d0ecbebf0182847251309a6ac522a422e8564d804d1d3d"

RPROVIDES:${PN} += "python3-rfc3161-client \
python3.13dist-rfc3161-client \
python313-rfc3161-client \
python3dist-rfc3161-client"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-cryptography"

inherit rpm
