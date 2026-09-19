SUMMARY = "Google API client core library"
DESCRIPTION = "Core Library for Google Client Libraries."
LICENSE = "Apache-2.0"

PV = "2.34.0"

RPM_NAME = "python313-google-api-core-2.34.0-3.1.noarch.rpm"
RPM_HASH = "d3636aae7ae3bbb645e6a539c011cf79be3e63311a14d11015b2c2934e294411b7bb78f52bd025e92b4ca2976185b9326ce039cb69a758433f2c407e2a88a5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-api-core \
python3.13dist-google-api-core \
python313-google-api-core \
python3dist-google-api-core"

RDEPENDS:${PN} += "-python313-googleapis-common-protos >= 1.69.2 with python313-googleapis-common-protos < 2.0.0 \
-python313-proto-plus >= 1.26.1 with python313-proto-plus < 2.0.0 \
-python313-protobuf >= 6.33.5 with python313-protobuf < 8.0.0 \
python-abi \
python313-google-auth \
python313-grpcio \
python313-grpcio-status \
python313-requests"

inherit rpm
