SUMMARY = "Google Cloud Monitoring API client library"
DESCRIPTION = "Google Cloud Monitoring API client library"
LICENSE = "Apache-2.0"

PV = "2.31.0"

RPM_NAME = "python314-google-cloud-monitoring-2.31.0-1.1.noarch.rpm"
RPM_HASH = "8f754516ad00082c25f6b7a1f2ae29b60bd370b809f6cace2bac7dea9d2e3209f23e251e78cc72d8644537458dcfb4390794f669b01fc1847fe370bb05d5f1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-monitoring \
python314-google-cloud-monitoring \
python3dist-google-cloud-monitoring"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
