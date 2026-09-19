SUMMARY = "Google Cloud Bigquery Storage API client library"
DESCRIPTION = "Google Cloud Bigquery Storage API client library."
LICENSE = "Apache-2.0"

PV = "2.37.0"

RPM_NAME = "python314-google-cloud-bigquery-storage-2.37.0-1.2.noarch.rpm"
RPM_HASH = "5c0bfba1960a72ebf4c3643f1cf86d6c0dd2ddb5b3d7a52e943e31e8459cd5eccbb9df4712a4e70eaa79f985035617c8bd36a2222b23f0189432c6ecf28d36cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-bigquery-storage \
python314-google-cloud-bigquery-storage \
python3dist-google-cloud-bigquery-storage"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-google-cloud-core \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
