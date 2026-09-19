SUMMARY = "GRPC library for the google-iam-v1 service"
DESCRIPTION = "GRPC library for the google-iam-v1 service"
LICENSE = "Apache-2.0"

PV = "0.14.5"

RPM_NAME = "python314-grpc-google-iam-v1-0.14.5-1.1.noarch.rpm"
RPM_HASH = "0c77446d35588f1f37f5146e38899efe8551371e6998b6a6b9da07fa232e435bd1d8dd77195e0e3f19f55c4f3e56a077ad49b904e409e29fec06d560654cb6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-grpc-google-iam-v1 \
python314-grpc-google-iam-v1 \
python3dist-grpc-google-iam-v1"

RDEPENDS:${PN} += "python-abi \
python314-googleapis-common-protos \
python314-grpcio \
python314-protobuf"

inherit rpm
