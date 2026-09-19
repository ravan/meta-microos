SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.27.0"

RPM_NAME = "python314-google-cloud-translate-3.27.0-1.1.noarch.rpm"
RPM_HASH = "61d9ddb334f9815b3543eb6d337603d4dcf15ae2405d51a1cf0db9bc55c38f853980f1f67766773c8cd35e3b7d556e579477b295fe87595f3aff68fcec9ec5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-translate \
python314-google-cloud-translate \
python3dist-google-cloud-translate"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-google-cloud-core \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
