SUMMARY = "Google Cloud Service Directory API client library"
DESCRIPTION = "Google Cloud Service Directory API client library"
LICENSE = "Apache-2.0"

PV = "1.18.0"

RPM_NAME = "python314-google-cloud-service-directory-1.18.0-1.1.noarch.rpm"
RPM_HASH = "e7c1e36e911846b2ea3dfbe22185a58f14d3861a23c0f6c25598c171c13cbe5b97c76b7927da96fcf260570b0981e6afeb65ab74fcf392aa6ae5cf89629d113a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-service-directory \
python314-google-cloud-service-directory \
python3dist-google-cloud-service-directory"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
