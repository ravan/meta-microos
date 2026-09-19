SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats. \
 \
This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "7.36.1"

RPM_NAME = "python314-protobuf-7.36.1-1.1.aarch64.rpm"
RPM_HASH = "50a8b10c3fb3e24f4b14d4136c3d651dc99d1793b910f7944c9fa117aae386a83732a4b6e7ab1a1b407990f386f6b02c6624b1e9491cc57865903d3c7a303b19"

RPROVIDES:${PN} += "python3.14dist-protobuf \
python314-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
