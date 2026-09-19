SUMMARY = "Google Cloud Secret Manager API client library"
DESCRIPTION = "Google Cloud Secret Manager API client library"
LICENSE = "Apache-2.0"

PV = "2.29.0"

RPM_NAME = "python314-google-cloud-secret-manager-2.29.0-1.1.noarch.rpm"
RPM_HASH = "d44ef4331fec8ae2aef7866293af2995ac0f265220df40d0ca200dc8bfdc93aca8c0d7adad87f335d476bf4265acac15e40fd57fff54d57bf3b3bba8be917ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-secret-manager \
python314-google-cloud-secret-manager \
python3dist-google-cloud-secret-manager"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
