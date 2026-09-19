SUMMARY = "A complete OpenID Connect implementation in Python"
DESCRIPTION = "This is a complete Python implementation of OpenID Connect as specified in \
the OpenID Connect Core specification. As a side effect, this is a complete \
implementation of OAuth2.0 too."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "python314-oic-1.7.0-2.5.noarch.rpm"
RPM_HASH = "bbc0854fd88cf6ce5b9d88771d02fa168535164730213ea4114065ee348fa7531c6c9aa91f047f054aead7e7681917500204a105829424a0e51e88898f1ec782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oic \
python314-oic \
python3dist-oic"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Mako \
python314-cryptography \
python314-defusedxml \
python314-pycryptodomex \
python314-pydantic-settings \
python314-pyjwkest \
python314-requests \
update-alternatives"

inherit rpm
