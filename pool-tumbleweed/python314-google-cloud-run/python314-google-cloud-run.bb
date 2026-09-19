SUMMARY = "Google Cloud Run API client library"
DESCRIPTION = "Google Cloud Run API client library"
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python314-google-cloud-run-0.16.1-1.1.noarch.rpm"
RPM_HASH = "27ed48b887c87de433e03830c19886d73d7e8584b015e224713ef45c3093551f6db3af130ad5e28ccd8f39ff746a846e26618fbd19f7ebe0148aeb62e2b2b187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-run \
python314-google-cloud-run \
python3dist-google-cloud-run"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
