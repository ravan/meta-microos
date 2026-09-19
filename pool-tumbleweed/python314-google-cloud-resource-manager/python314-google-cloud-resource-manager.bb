SUMMARY = "Google Cloud Resource Manager API client library"
DESCRIPTION = "Google Cloud Resource Manager API client library"
LICENSE = "Apache-2.0"

PV = "1.18.0"

RPM_NAME = "python314-google-cloud-resource-manager-1.18.0-1.1.noarch.rpm"
RPM_HASH = "1b6cfee56f6551145e08de7281945b77b17bbd1a77a3a6e97b2fe8c2edd287d174ed2ddb0b4d84ec1fff8e6830b810021db795be5123b2f5588ed3bc355698c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-resource-manager \
python314-google-cloud-resource-manager \
python3dist-google-cloud-resource-manager"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
