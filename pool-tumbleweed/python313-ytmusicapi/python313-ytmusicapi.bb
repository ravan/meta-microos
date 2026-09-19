SUMMARY = "Unofficial API for YouTube Music"
DESCRIPTION = "Unofficial API for YouTube Music"
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "python313-ytmusicapi-1.12.2-1.1.noarch.rpm"
RPM_HASH = "1b2fa5ca385cd1ae7ead983e2e22bd8527ab7a77aaa6d9cc02a293ba940923c56a82b775eb4d7c4d6ecac02fb8b6ee840a36f68d6c6614b969f221ac52dea9fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ytmusicapi \
python3.13dist-ytmusicapi \
python313-ytmusicapi \
python3dist-ytmusicapi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-requests \
update-alternatives"

inherit rpm
