SUMMARY = "Google Cloud Bigtable API client library"
DESCRIPTION = "Google Cloud Bigtable API client library."
LICENSE = "Apache-2.0"

PV = "2.41.0"

RPM_NAME = "python313-google-cloud-bigtable-2.41.0-1.1.noarch.rpm"
RPM_HASH = "4da6411dc68cbf47f73f818e08a9036fd638319b58802d61835e6147f831d998a30903a2b1a3930e09ba55760933d5f076e2268767b629a1e6a1c9aaa15a4294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-bigtable \
python3.13dist-google-cloud-bigtable \
python313-google-cloud-bigtable \
python3dist-google-cloud-bigtable"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-google-cloud-core \
python313-google-crc32c \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
