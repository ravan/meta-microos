SUMMARY = "MediaWiki API client"
DESCRIPTION = "MediaWiki API client"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python314-mwclient-0.11.0-1.6.noarch.rpm"
RPM_HASH = "7601d577d2796cda511c848fac5fba407e4687d8fafc79b42fcfa476997d74914b4c4e8026e479daaa3df7756893c0b9ba35dce394249d7395b070ca6db7da1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mwclient \
python314-mwclient \
python3dist-mwclient"

RDEPENDS:${PN} += "python-abi \
python314-requests-oauthlib"

inherit rpm
