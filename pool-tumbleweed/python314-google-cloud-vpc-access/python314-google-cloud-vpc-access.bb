SUMMARY = "Google Cloud Vpc Access API client library"
DESCRIPTION = "Google Cloud Vpc Access API client library"
LICENSE = "Apache-2.0"

PV = "1.17.0"

RPM_NAME = "python314-google-cloud-vpc-access-1.17.0-1.1.noarch.rpm"
RPM_HASH = "c20a27a5db34112ed5c2f892fd97df68cd0af00187e48e74e26cd73dabcc3d7277d0a9e819f32b6e5e6cd287fe3078a3198d0475b2e293741e32ab0bc5ca44f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-vpc-access \
python314-google-cloud-vpc-access \
python3dist-google-cloud-vpc-access"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
