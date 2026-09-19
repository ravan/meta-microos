SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "3.16.0"

RPM_NAME = "python314-google-cloud-kms-3.16.0-1.1.noarch.rpm"
RPM_HASH = "dbc2a1241e8d296809d63867ee5ad61735804b3252106e06da14c71b07e144f818b8f0e8fc230c8ca09ac6803eb9c7e850c42dc868a9eef58f962254fab96e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-kms \
python314-google-cloud-kms \
python3dist-google-cloud-kms"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf \
update-alternatives"

inherit rpm
