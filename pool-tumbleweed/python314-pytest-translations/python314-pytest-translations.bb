SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python314-pytest-translations-5.0.0-1.11.noarch.rpm"
RPM_HASH = "7980f3137f83f30972abcdcf4390686ad3ef590f83d6a86f98413ea9655949140c37c369132b1661009493a2fda1b2238309c84d537fe0beee2d152645c15965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-translations \
python314-pytest-translations \
python3dist-pytest-translations"

RDEPENDS:${PN} += "python-abi \
python314-polib \
python314-pyenchant"

inherit rpm
