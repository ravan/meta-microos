SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.80.0"

RPM_NAME = "python314-grpcio-tools-1.80.0-1.4.aarch64.rpm"
RPM_HASH = "0008dd4e7e4a8a2d062d1c398fd6cc5a645b016a655e8d511802de109ef82e4ee88770f6468ff5f2d8896be43c16f241f5ee5668a20829fc26b85ea46b8a0e54"

RPROVIDES:${PN} += "python3.14dist-grpcio-tools \
python314-grpcio-tools \
python3dist-grpcio-tools"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-grpcio \
python314-protobuf \
python314-setuptools \
update-alternatives"

inherit rpm
