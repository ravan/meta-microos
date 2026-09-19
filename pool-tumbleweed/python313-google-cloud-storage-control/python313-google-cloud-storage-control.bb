SUMMARY = "Google Cloud Storage Control API client library"
DESCRIPTION = "Google Cloud Storage Control API client library"
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python313-google-cloud-storage-control-1.13.0-1.1.noarch.rpm"
RPM_HASH = "7e4ed0679c24427260af21242f763f55da265b8e5542ee7874d34d5cf6615ff5ec81fdef7f7bbfb28fc5bc624abaf2cacaa6ed836087dc92a4208ca6bf3cf5ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-storage-control \
python3.13dist-google-cloud-storage-control \
python313-google-cloud-storage-control \
python3dist-google-cloud-storage-control"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
