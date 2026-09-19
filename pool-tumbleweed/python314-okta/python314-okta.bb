SUMMARY = "Python SDK for the Okta Management API"
DESCRIPTION = "Python SDK for the Okta Management API."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "python314-okta-3.4.4-1.1.noarch.rpm"
RPM_HASH = "1f70f52235f71b0b5c8e60f09553a7a883adfe192f622fac8b0635cefd4d3275e94d1f1c51ef26cee6da07ed1a2fac957acf0e619e847579e9997987971778f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-okta \
python314-okta \
python3dist-okta"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-PyYAML \
python314-aenum \
python314-aiohttp \
python314-blinker \
python314-flatdict \
python314-jwcrypto \
python314-pycryptodomex \
python314-pydantic \
python314-pydash \
python314-python-dateutil \
python314-requests \
python314-typing-extensions \
python314-urllib3 \
python314-xmltodict \
python314-yarl"

inherit rpm
