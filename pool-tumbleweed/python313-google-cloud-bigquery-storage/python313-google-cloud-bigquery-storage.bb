SUMMARY = "Google Cloud Bigquery Storage API client library"
DESCRIPTION = "Google Cloud Bigquery Storage API client library."
LICENSE = "Apache-2.0"

PV = "2.37.0"

RPM_NAME = "python313-google-cloud-bigquery-storage-2.37.0-1.2.noarch.rpm"
RPM_HASH = "1059ed5fb5f46af5aa12e90365cc8df6c5e8534817f149bfae34364c3978f2ba8c27e78c7ce5d8599ccf076daaf06fb1ad7e447a4caceeb74d0c0db183b0b04e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-bigquery-storage \
python3.13dist-google-cloud-bigquery-storage \
python313-google-cloud-bigquery-storage \
python3dist-google-cloud-bigquery-storage"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-google-cloud-core \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
