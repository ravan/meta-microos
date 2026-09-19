SUMMARY = "Google Cloud Storage API python client library"
DESCRIPTION = "Google Cloud Storage allows you to store data on Google \
infrastructure with very high reliability, performance and \
availability, and can be used to distribute large data objects \
to users via direct download. This package provides client to it."
LICENSE = "Apache-2.0"

PV = "3.13.1"

RPM_NAME = "python314-google-cloud-storage-3.13.1-1.1.noarch.rpm"
RPM_HASH = "ae46e145816b00c3fde1aeecaa3fa292dcb0697a1f2e734a163114aae835036d134b4e2a8a7bd5a45fb884ba2f88877a3cda0c97f8b78c5a8de0094b47705957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-storage \
python314-google-cloud-storage \
python3dist-google-cloud-storage"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-google-cloud-core \
python314-google-crc32c \
python314-google-resumable-media \
python314-googleapis-common-protos \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf \
python314-requests"

inherit rpm
