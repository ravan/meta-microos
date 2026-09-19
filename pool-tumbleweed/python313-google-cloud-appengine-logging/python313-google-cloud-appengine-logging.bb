SUMMARY = "Google Cloud Appengine Logging API client library"
DESCRIPTION = "Google Cloud Appengine Logging API client library"
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "python313-google-cloud-appengine-logging-1.10.0-1.1.noarch.rpm"
RPM_HASH = "96bc495f0d80e9ef197388342fb718eac12948b0262a0b337f9c992c074521421689addb5f2efa387ede2363d5012db6784e572dfec0fdf1d181e4d7a9cea639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-appengine-logging \
python3.13dist-google-cloud-appengine-logging \
python313-google-cloud-appengine-logging \
python3dist-google-cloud-appengine-logging"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
