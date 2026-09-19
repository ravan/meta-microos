SUMMARY = "Google Cloud Monitoring API client library"
DESCRIPTION = "Google Cloud Monitoring API client library"
LICENSE = "Apache-2.0"

PV = "2.31.0"

RPM_NAME = "python313-google-cloud-monitoring-2.31.0-1.1.noarch.rpm"
RPM_HASH = "70af9abd7c4e35d74a3286874904b3165826d66fd94164d348d07618e5e7e9dda2f92378b95b2dac5e762d313f17cb80b3741b060c75039c388caea97bf95531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-monitoring \
python3.13dist-google-cloud-monitoring \
python313-google-cloud-monitoring \
python3dist-google-cloud-monitoring"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
