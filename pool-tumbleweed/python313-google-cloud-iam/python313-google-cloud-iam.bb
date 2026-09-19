SUMMARY = "Google Cloud Iam API client library"
DESCRIPTION = "Google Cloud Iam API client library"
LICENSE = "Apache-2.0"

PV = "2.24.1"

RPM_NAME = "python313-google-cloud-iam-2.24.1-1.1.noarch.rpm"
RPM_HASH = "cecc2b1407ec17c0a103f04753d5c8e38648201da46d418e9efbbcff7d3a434a2a4b0bfcfc44a3760cf6dc8006876ef62e02abe16b359987f21ecfb06a3b619f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-iam \
python3.13dist-google-cloud-iam \
python313-google-cloud-iam \
python3dist-google-cloud-iam"

RDEPENDS:${PN} += "-python313-grpc-google-iam-v1 >= 0.12.4 with python313-grpc-google-iam-v1 < 1.0.0dev \
python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
