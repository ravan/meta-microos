SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.80.0"

RPM_NAME = "python313-grpcio-tools-1.80.0-1.4.aarch64.rpm"
RPM_HASH = "597ba0330ec60122ef18ec4cff5e6ac9f72e99fadb0b8e3ba1dc23f05afd2b4c3fbea285ccc03f42a2414225fcc66e9beb2dfeb7f3b3d699df2a2203fb00f8cd"

RPROVIDES:${PN} += "python3-grpcio-tools \
python3.13dist-grpcio-tools \
python313-grpcio-tools \
python3dist-grpcio-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-grpcio \
python313-protobuf \
python313-setuptools \
update-alternatives"

inherit rpm
