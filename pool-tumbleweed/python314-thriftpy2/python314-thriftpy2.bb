SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-thriftpy2-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "1bfbf50730b455000d7c8056c9637c0cc92563fb8848735e4b4ece6b12255255ba3b7bf6c822f159944409156b8a3ee33f120f7c3dce018689faf3da88f82e11"

RPROVIDES:${PN} += "python3.14dist-thriftpy2 \
python314-thriftpy2 \
python3dist-thriftpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-ply \
python314-six"

inherit rpm
