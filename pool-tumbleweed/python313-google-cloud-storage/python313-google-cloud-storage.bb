SUMMARY = "Google Cloud Storage API python client library"
DESCRIPTION = "Google Cloud Storage allows you to store data on Google \
infrastructure with very high reliability, performance and \
availability, and can be used to distribute large data objects \
to users via direct download. This package provides client to it."
LICENSE = "Apache-2.0"

PV = "3.13.1"

RPM_NAME = "python313-google-cloud-storage-3.13.1-1.1.noarch.rpm"
RPM_HASH = "f00c6070ff1bf6586d9343bfff831fcef14bc674836299f3130ef4ba3580c1b81205269681cb701d32deb8bf20fc771765cd59dcbccb76dff00a5563040bd94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-storage \
python3.13dist-google-cloud-storage \
python313-google-cloud-storage \
python3dist-google-cloud-storage"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-google-cloud-core \
python313-google-crc32c \
python313-google-resumable-media \
python313-googleapis-common-protos \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf \
python313-requests"

inherit rpm
