SUMMARY = "Google Cloud Iam API client library"
DESCRIPTION = "Google Cloud Iam API client library"
LICENSE = "Apache-2.0"

PV = "2.24.1"

RPM_NAME = "python314-google-cloud-iam-2.24.1-1.1.noarch.rpm"
RPM_HASH = "805b8816ce0049370f3be917e3e3107a5af4e478d62604da32cc2f90908d7485592687b1b4ffd2dfcdf50158a532a5ee1491be8035ccd1c33db34759cf4d3d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-iam \
python314-google-cloud-iam \
python3dist-google-cloud-iam"

RDEPENDS:${PN} += "-python314-grpc-google-iam-v1 >= 0.12.4 with python314-grpc-google-iam-v1 < 1.0.0dev \
python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
