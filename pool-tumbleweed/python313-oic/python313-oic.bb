SUMMARY = "A complete OpenID Connect implementation in Python"
DESCRIPTION = "This is a complete Python implementation of OpenID Connect as specified in \
the OpenID Connect Core specification. As a side effect, this is a complete \
implementation of OAuth2.0 too."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "python313-oic-1.7.0-2.5.noarch.rpm"
RPM_HASH = "e7ac607ed91e5bd9e1ee6239e8d55e84a1479ad1856b8c62455bcc75c9a12b936a5cef337d31247795bf33ef66c953e7d25504149a89f8123ded730553a59142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oic \
python3.13dist-oic \
python313-oic \
python3dist-oic"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Mako \
python313-cryptography \
python313-defusedxml \
python313-pycryptodomex \
python313-pydantic-settings \
python313-pyjwkest \
python313-requests \
update-alternatives"

inherit rpm
