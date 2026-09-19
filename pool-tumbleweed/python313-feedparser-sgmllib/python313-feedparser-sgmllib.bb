SUMMARY = "This is sgmllib from Python 2.7. For feedparser use only"
DESCRIPTION = "This is sgmllib from Python 2.7. For feedparser use only."
LICENSE = "Python-2.0"

PV = "2.1.0"

RPM_NAME = "python313-feedparser-sgmllib-2.1.0-1.1.noarch.rpm"
RPM_HASH = "a36b493745e5c41e471eabf659c157b2a70567a8ddf899d71095b2ce58ccd6251cb789667b03a5a8deeadb84fae6ec446afda5e0a2121f113f0f1ed42d75d336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedparser-sgmllib \
python3.13dist-feedparser-sgmllib \
python313-feedparser-sgmllib \
python3dist-feedparser-sgmllib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
