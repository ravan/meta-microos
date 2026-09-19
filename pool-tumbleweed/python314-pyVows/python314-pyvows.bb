SUMMARY = "BDD test engine based on Vows.js"
DESCRIPTION = "pyVows is a BDD test engine based on Vows.js <http://vowsjs.org>."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-pyVows-3.0.0-3.5.noarch.rpm"
RPM_HASH = "369bca5504fbcde70f3c92c36834f0ddfe452c3f35467710d4a9a9e077f572432c9af2b9f9c3921545b96e28581dad4507608b60f628210aceb26cbd124b5cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyvows \
python314-pyVows \
python3dist-pyvows"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Unidecode \
python314-gevent \
python314-preggy"

inherit rpm
