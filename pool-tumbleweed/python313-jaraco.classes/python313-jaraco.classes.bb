SUMMARY = "Tools to work with classes"
DESCRIPTION = "jaraco.classes Tools for working with classes."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python313-jaraco.classes-3.4.0-2.5.noarch.rpm"
RPM_HASH = "99958854cff111ff6aef75eed3663e65bf51c8714f7e10a7e1b4978612b2accfcf46994ce9e797fe999be1aefae30c060e499607a81b4284c286d87f25392634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.classes \
python3.13dist-jaraco.classes \
python313-jaraco.classes \
python3dist-jaraco.classes"

RDEPENDS:${PN} += "python-abi \
python313-more-itertools"

inherit rpm
