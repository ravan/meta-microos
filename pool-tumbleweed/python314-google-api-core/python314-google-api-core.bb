SUMMARY = "Google API client core library"
DESCRIPTION = "Core Library for Google Client Libraries."
LICENSE = "Apache-2.0"

PV = "2.34.0"

RPM_NAME = "python314-google-api-core-2.34.0-3.1.noarch.rpm"
RPM_HASH = "64fb184368bac7c15a3443ccd43d9fdbb0f2e8295b7ed5a3824b0308c5ef4413785145493eebfdbd82b4fad3be618293429bc01eb500cebccd5e9933a9daf276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-api-core \
python314-google-api-core \
python3dist-google-api-core"

RDEPENDS:${PN} += "-python314-googleapis-common-protos >= 1.69.2 with python314-googleapis-common-protos < 2.0.0 \
-python314-proto-plus >= 1.26.1 with python314-proto-plus < 2.0.0 \
-python314-protobuf >= 6.33.5 with python314-protobuf < 8.0.0 \
python-abi \
python314-google-auth \
python314-grpcio \
python314-grpcio-status \
python314-requests"

inherit rpm
