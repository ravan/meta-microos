SUMMARY = "Google Cloud Kms Inventory API client library"
DESCRIPTION = "Google Cloud Kms Inventory API client library"
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python314-google-cloud-kms-inventory-0.6.1-1.1.noarch.rpm"
RPM_HASH = "9f09a30c3766eb3eead3fc49a73b4e7f48994e9b279ecd6cafbc5fd0c7ea7b52e0a110c0f320f2be0860145f254d707527fd7cd82183366c7238ee7d313825ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-kms-inventory \
python314-google-cloud-kms-inventory \
python3dist-google-cloud-kms-inventory"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-google-cloud-kms \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
