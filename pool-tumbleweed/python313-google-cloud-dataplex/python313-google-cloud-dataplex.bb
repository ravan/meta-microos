SUMMARY = "Google Cloud Dataplex API client library"
DESCRIPTION = "Google Cloud Dataplex API client library. \
Dataplex is an intelligent data fabric that helps organizations centrally \
manage, monitor, and govern their data across data lakes, data warehouses, and \
data marts. It provides a unified governance solution for data and AI assets."
LICENSE = "Apache-2.0"

PV = "2.18.0"

RPM_NAME = "python313-google-cloud-dataplex-2.18.0-1.2.noarch.rpm"
RPM_HASH = "8b4ae7618a6b03854cbd62b81e7be55d12b80190a91b1f09692fee046e55291c10cd6afa9653cd1922b9864634ae37a2a1ed64d79aba62004ba0e887f3303b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-dataplex \
python3.13dist-google-cloud-dataplex \
python313-google-cloud-dataplex \
python3dist-google-cloud-dataplex"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
