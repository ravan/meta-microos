SUMMARY = "Google Cloud Run API client library"
DESCRIPTION = "Google Cloud Run API client library"
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python313-google-cloud-run-0.16.1-1.1.noarch.rpm"
RPM_HASH = "1612a09b9a9af57016b3c2577aa6e4dac4efd3b306a3fd2378b23448ddde53e7818042475c325c886334f306ad9eef91d99815bdff5995a52f365c1df3814073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-run \
python3.13dist-google-cloud-run \
python313-google-cloud-run \
python3dist-google-cloud-run"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
