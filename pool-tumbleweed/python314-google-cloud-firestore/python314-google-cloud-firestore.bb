SUMMARY = "Google Cloud Firestore API client library"
DESCRIPTION = "Google Cloud Firestore API client library"
LICENSE = "Apache-2.0"

PV = "2.28.1"

RPM_NAME = "python314-google-cloud-firestore-2.28.1-1.1.noarch.rpm"
RPM_HASH = "71c4947abe93cf666cae65972e9356f93a592ec406d2a1f68b446387d88e07a49854174e45c99f96f63ac0405de63c35b68217beb4bcab53df55f5005428a8c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-firestore \
python314-google-cloud-firestore \
python3dist-google-cloud-firestore"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-cloud-core \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
