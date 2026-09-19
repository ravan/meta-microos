SUMMARY = "Google Cloud Dataplex API client library"
DESCRIPTION = "Google Cloud Dataplex API client library. \
Dataplex is an intelligent data fabric that helps organizations centrally \
manage, monitor, and govern their data across data lakes, data warehouses, and \
data marts. It provides a unified governance solution for data and AI assets."
LICENSE = "Apache-2.0"

PV = "2.18.0"

RPM_NAME = "python314-google-cloud-dataplex-2.18.0-1.2.noarch.rpm"
RPM_HASH = "72623522f56b33ad897dfcd65177188cb7ae5cca63b9275b3e3f85fab260efe8f55bb6b817c9a26f1a1208c5e3a7994f18ab3e93dbb8405daca66d241399644c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-dataplex \
python314-google-cloud-dataplex \
python3dist-google-cloud-dataplex"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
