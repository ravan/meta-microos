SUMMARY = "Google Cloud Firestore API client library"
DESCRIPTION = "Google Cloud Firestore API client library"
LICENSE = "Apache-2.0"

PV = "2.28.1"

RPM_NAME = "python313-google-cloud-firestore-2.28.1-1.1.noarch.rpm"
RPM_HASH = "bbab8988eb3633881b7468f8cb63b3bfa66995e2f036f990b2e965842deacd21f2660ee7a2f61cfaa83cefe0717a0d905d75c847a431e22a6718da9870c19069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-firestore \
python3.13dist-google-cloud-firestore \
python313-google-cloud-firestore \
python3dist-google-cloud-firestore"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-cloud-core \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
