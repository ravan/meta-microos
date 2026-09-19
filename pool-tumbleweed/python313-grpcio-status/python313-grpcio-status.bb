SUMMARY = "Status proto mapping for gRPC"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems. \
 \
This package implements the GRPC Python status proto mapping."
LICENSE = "Apache-2.0"

PV = "1.81.1"

RPM_NAME = "python313-grpcio-status-1.81.1-1.2.noarch.rpm"
RPM_HASH = "421c2105c0e40b3d3b422296b4d0836b679972fc259c1744a166cd95a6165acfae79963cc6949887daf28119f546728d0013c54eb0b72fb19da799bc64cc01c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grpcio-status \
python3.13dist-grpcio-status \
python313-grpcio-status \
python3dist-grpcio-status"

RDEPENDS:${PN} += "python-abi \
python313-googleapis-common-protos \
python313-grpcio \
python313-protobuf"

inherit rpm
