SUMMARY = "Unofficial API for YouTube Music"
DESCRIPTION = "Unofficial API for YouTube Music"
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "python314-ytmusicapi-1.12.2-1.1.noarch.rpm"
RPM_HASH = "fd7fb5849f81e963e40c66fb9150107caa08c7310e25560a89ebcb2f314fc5db77662f0a7b51f00b7e8d6722431a10f85ebd03a7b4ac761331edfa6bbf2fbe28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ytmusicapi \
python314-ytmusicapi \
python3dist-ytmusicapi"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-requests \
update-alternatives"

inherit rpm
