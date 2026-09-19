SUMMARY = "Google Cloud Storage Control API client library"
DESCRIPTION = "Google Cloud Storage Control API client library"
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python314-google-cloud-storage-control-1.13.0-1.1.noarch.rpm"
RPM_HASH = "a48c7a2a88630cfcb50cba94a4ce6bd0b6c3d5925a1e38d747045a147051462fad2491624fbdea91bd62f1ced8cf221a881b6f6f9ff67ba827f5f43b24ce099e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-storage-control \
python314-google-cloud-storage-control \
python3dist-google-cloud-storage-control"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
