SUMMARY = "Google Cloud Bigtable API client library"
DESCRIPTION = "Google Cloud Bigtable API client library."
LICENSE = "Apache-2.0"

PV = "2.41.0"

RPM_NAME = "python314-google-cloud-bigtable-2.41.0-1.1.noarch.rpm"
RPM_HASH = "ea479a406831a3c467570a3f159704150ad7914036f4187f4149e843677111bac6190cf0cca7493951a50aa65596dede221329e3b76e41766e2b2a29d3db0285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-bigtable \
python314-google-cloud-bigtable \
python3dist-google-cloud-bigtable"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-google-cloud-core \
python314-google-crc32c \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
