SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "3.16.0"

RPM_NAME = "python313-google-cloud-kms-3.16.0-1.1.noarch.rpm"
RPM_HASH = "f3847b8797f41ad96b47dd613c5c5f285fa45ff0f8f6c95178c66b543e3e6de830d3db6e5a94f5eecf58ce9ddec351978b0952fc839be03a1e98076b5e15e757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-kms \
python3.13dist-google-cloud-kms \
python313-google-cloud-kms \
python3dist-google-cloud-kms"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf \
update-alternatives"

inherit rpm
