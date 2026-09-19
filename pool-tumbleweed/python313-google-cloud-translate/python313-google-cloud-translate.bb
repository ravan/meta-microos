SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.27.0"

RPM_NAME = "python313-google-cloud-translate-3.27.0-1.1.noarch.rpm"
RPM_HASH = "88344195b0723577967deb56d78075783ff6097f28e3ffafc525a2478b67972e716055cbf53cc02581b5ed7719740ecd2fdeb2317dc8c5467eb2361de879b7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-translate \
python3.13dist-google-cloud-translate \
python313-google-cloud-translate \
python3dist-google-cloud-translate"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-google-cloud-core \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
