SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python313-pytest-translations-5.0.0-1.11.noarch.rpm"
RPM_HASH = "eece76f663a7170154e190a140f898824afaf540aa0337fd6e0a350ee9e684b2a1661cbf474f555651248dd0f5f715a96a0f47b3902075348be381e5752a7e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-translations \
python3.13dist-pytest-translations \
python313-pytest-translations \
python3dist-pytest-translations"

RDEPENDS:${PN} += "python-abi \
python313-polib \
python313-pyenchant"

inherit rpm
