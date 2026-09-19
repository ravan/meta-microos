SUMMARY = "Google Cloud Artifact Registry API client library"
DESCRIPTION = "Google Cloud Artifact Registry API client library"
LICENSE = "Apache-2.0"

PV = "1.22.0"

RPM_NAME = "python314-google-cloud-artifact-registry-1.22.0-1.1.noarch.rpm"
RPM_HASH = "4cbf22818becc5df84ae609ecdd448f01e8e3bdf76a2d6b7c3d544ecb4cb50098003b6a738791efdfedbdd64f262499d133e6548a6c72f71f14a18f08a0aa878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-artifact-registry \
python314-google-cloud-artifact-registry \
python3dist-google-cloud-artifact-registry"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
