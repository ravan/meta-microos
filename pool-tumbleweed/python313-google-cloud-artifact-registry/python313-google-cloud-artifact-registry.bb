SUMMARY = "Google Cloud Artifact Registry API client library"
DESCRIPTION = "Google Cloud Artifact Registry API client library"
LICENSE = "Apache-2.0"

PV = "1.22.0"

RPM_NAME = "python313-google-cloud-artifact-registry-1.22.0-1.1.noarch.rpm"
RPM_HASH = "d729af38d6e7ec934fd07c2cef9c8fc8b117bdc5e9f746d7c8d22806d8585f90bfd9ce2907995a29e6b59a0ef83520a79064215613dc3d319a08d69876921c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-artifact-registry \
python3.13dist-google-cloud-artifact-registry \
python313-google-cloud-artifact-registry \
python3dist-google-cloud-artifact-registry"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
