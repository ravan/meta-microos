SUMMARY = "Google Cloud Resource Manager API client library"
DESCRIPTION = "Google Cloud Resource Manager API client library"
LICENSE = "Apache-2.0"

PV = "1.18.0"

RPM_NAME = "python313-google-cloud-resource-manager-1.18.0-1.1.noarch.rpm"
RPM_HASH = "5ab89188c7e196ff592d20da5e2f7093737be8ece795ccb79e1487c3674524fc175d1563066e62e6dba513c666c68249b6c0391d43047e5673ffe6ca3a83c1c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-resource-manager \
python3.13dist-google-cloud-resource-manager \
python313-google-cloud-resource-manager \
python3dist-google-cloud-resource-manager"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
