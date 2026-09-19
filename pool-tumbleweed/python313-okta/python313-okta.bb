SUMMARY = "Python SDK for the Okta Management API"
DESCRIPTION = "Python SDK for the Okta Management API."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "python313-okta-3.4.4-1.1.noarch.rpm"
RPM_HASH = "babf38ffad511b3eb49ade8132f4dc21f325166bdf5327e93023f65963f981b956f74035a05d2aa410076b32ff40c89627b6348796d14b30eddd9a8d5aa6ddcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-okta \
python3.13dist-okta \
python313-okta \
python3dist-okta"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-PyYAML \
python313-aenum \
python313-aiohttp \
python313-blinker \
python313-flatdict \
python313-jwcrypto \
python313-pycryptodomex \
python313-pydantic \
python313-pydash \
python313-python-dateutil \
python313-requests \
python313-typing-extensions \
python313-urllib3 \
python313-xmltodict \
python313-yarl"

inherit rpm
