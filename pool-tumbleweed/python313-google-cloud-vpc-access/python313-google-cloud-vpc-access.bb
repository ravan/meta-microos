SUMMARY = "Google Cloud Vpc Access API client library"
DESCRIPTION = "Google Cloud Vpc Access API client library"
LICENSE = "Apache-2.0"

PV = "1.17.0"

RPM_NAME = "python313-google-cloud-vpc-access-1.17.0-1.1.noarch.rpm"
RPM_HASH = "545233d4dd1e81e7bf7e28b34fa901105356ad61ed7539588c07e8415e23e082e1dbbacb1d34a0a19ea724956e59f279b7e73e4aabb738ef72f429c8e2963dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-vpc-access \
python3.13dist-google-cloud-vpc-access \
python313-google-cloud-vpc-access \
python3dist-google-cloud-vpc-access"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
