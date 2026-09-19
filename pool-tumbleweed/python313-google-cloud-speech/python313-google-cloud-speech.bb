SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.40.0"

RPM_NAME = "python313-google-cloud-speech-2.40.0-1.1.noarch.rpm"
RPM_HASH = "7df093c5f69beda992867fd0c807d4c5a6128edebfe125219537386b8039e3b4474f4f35ab3458d989f6d68195722feb6053ae7ec814e6c20efc268924b60885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-speech \
python3.13dist-google-cloud-speech \
python313-google-cloud-speech \
python3dist-google-cloud-speech"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
