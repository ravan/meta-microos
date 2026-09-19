SUMMARY = "Google Cloud Domains API client library"
DESCRIPTION = "Google Cloud Domains API client library"
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python313-google-cloud-domains-1.14.0-1.1.noarch.rpm"
RPM_HASH = "396a82c2f10606f1029d003dcfc4f755ebba8a0d1a93733b13d39448b1d27cc82d14b859f96de78850858cdc7cc21f10147141707fbdcdfa1ebcca369b5fd432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-domains \
python3.13dist-google-cloud-domains \
python313-google-cloud-domains \
python3dist-google-cloud-domains"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
