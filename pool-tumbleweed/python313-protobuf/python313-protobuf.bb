SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats. \
 \
This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "7.36.1"

RPM_NAME = "python313-protobuf-7.36.1-1.1.aarch64.rpm"
RPM_HASH = "2ecf7e6e8cacd540ccf4f04e71b468c1643fd96286594033945ea706073314fc9278e15e9f97494ef5d969efaef2ee97ae10c9d725c4ecf2b61d8649491b66e6"

RPROVIDES:${PN} += "python3-protobuf \
python3.13dist-protobuf \
python313-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
