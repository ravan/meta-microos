SUMMARY = "Google Cloud Kms Inventory API client library"
DESCRIPTION = "Google Cloud Kms Inventory API client library"
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python313-google-cloud-kms-inventory-0.6.1-1.1.noarch.rpm"
RPM_HASH = "c7e54e34471b87bdb11afee3f7e1cb1e4e4e457b9ca8cc823b5afa5eadf674febe8e9c49e07c0e5cb19105b28d63fceec5900cd7dd873df7841827099f280eee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-kms-inventory \
python3.13dist-google-cloud-kms-inventory \
python313-google-cloud-kms-inventory \
python3dist-google-cloud-kms-inventory"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-google-cloud-kms \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
