SUMMARY = "Google Cloud Build API client library"
DESCRIPTION = "Google Cloud Build API client library"
LICENSE = "Apache-2.0"

PV = "3.38.1"

RPM_NAME = "python313-google-cloud-build-3.38.1-1.1.noarch.rpm"
RPM_HASH = "91e98542e93499bcd09f7a89064833caaed488c04859a7c76dfe38332cf736150de180485cb4e415e6baec1d884e7322adeb08dff6fba2e869744db092f1c20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-build \
python3.13dist-google-cloud-build \
python313-google-cloud-build \
python3dist-google-cloud-build"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
