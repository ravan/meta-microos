SUMMARY = "Status proto mapping for gRPC"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems. \
 \
This package implements the GRPC Python status proto mapping."
LICENSE = "Apache-2.0"

PV = "1.81.1"

RPM_NAME = "python314-grpcio-status-1.81.1-1.2.noarch.rpm"
RPM_HASH = "ae410b5972e638ab5ce49ab40b4c08c42367a2097059cb6d866a81fd34c190865b3e87035af00b7729134e9761dd385f1837b9962cf74dd5e1347cddb24e3278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-grpcio-status \
python314-grpcio-status \
python3dist-grpcio-status"

RDEPENDS:${PN} += "python-abi \
python314-googleapis-common-protos \
python314-grpcio \
python314-protobuf"

inherit rpm
