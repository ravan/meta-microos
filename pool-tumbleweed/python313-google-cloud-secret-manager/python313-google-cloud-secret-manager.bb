SUMMARY = "Google Cloud Secret Manager API client library"
DESCRIPTION = "Google Cloud Secret Manager API client library"
LICENSE = "Apache-2.0"

PV = "2.29.0"

RPM_NAME = "python313-google-cloud-secret-manager-2.29.0-1.1.noarch.rpm"
RPM_HASH = "2220d361aeda9e7ecb2b43a2501715185da561cf08855938b6440c3eddcef4b80f3cfac7fe7cdef51d0528deb7d71c61c6901d92e43ab6da80fd4572ab6a29fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-secret-manager \
python3.13dist-google-cloud-secret-manager \
python313-google-cloud-secret-manager \
python3dist-google-cloud-secret-manager"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
