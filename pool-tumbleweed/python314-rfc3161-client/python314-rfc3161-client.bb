SUMMARY = "Python library implementing the Time-Stamp Protocol (TSP) described in RFC 3161"
DESCRIPTION = "rfc3161-client is a Python library implementing the Time-Stamp \
Protocol (TSP) described in RFC 3161."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "python314-rfc3161-client-1.0.6-1.6.aarch64.rpm"
RPM_HASH = "ce0130e88c3ab36acdff6bef28abb76a850dfc2995b815136e9bbc6298d2796e2d69a54dba38e29e2d39ddcc1ab8c913a19afdfeaf142b606b184835c7b591cb"

RPROVIDES:${PN} += "python3.14dist-rfc3161-client \
python314-rfc3161-client \
python3dist-rfc3161-client"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-cryptography"

inherit rpm
