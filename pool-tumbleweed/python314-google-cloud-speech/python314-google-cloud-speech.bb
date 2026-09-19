SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.40.0"

RPM_NAME = "python314-google-cloud-speech-2.40.0-1.1.noarch.rpm"
RPM_HASH = "225e36bc4d7d15233c213f183ed5534250e8d73a02b10a9b97b220e2f9690416bd80c437e72a27b1a1eba6f8f4cac0e3bf2f2b5c968140fd9be09063ec6152b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-speech \
python314-google-cloud-speech \
python3dist-google-cloud-speech"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
