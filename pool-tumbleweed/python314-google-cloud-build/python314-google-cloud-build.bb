SUMMARY = "Google Cloud Build API client library"
DESCRIPTION = "Google Cloud Build API client library"
LICENSE = "Apache-2.0"

PV = "3.38.1"

RPM_NAME = "python314-google-cloud-build-3.38.1-1.1.noarch.rpm"
RPM_HASH = "3e1ca1a5b67fcc714804fb06f27abe509764179debf18e5d32f6b1c5980707b50cc42fa6fe4780004bae4a5ed1a5529609d8d65180fe43664752815debd892bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-build \
python314-google-cloud-build \
python3dist-google-cloud-build"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
