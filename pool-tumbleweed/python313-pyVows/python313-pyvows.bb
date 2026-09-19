SUMMARY = "BDD test engine based on Vows.js"
DESCRIPTION = "pyVows is a BDD test engine based on Vows.js <http://vowsjs.org>."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-pyVows-3.0.0-3.5.noarch.rpm"
RPM_HASH = "f4a8273a6066e2c49915482a9ff3909a0b0f0c05643e90934670b02558496a4181b87bdf15eb9d1fab912fd385b427bdf06353f6adfbf9073fc7a96f87836b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyVows \
python3.13dist-pyvows \
python313-pyVows \
python3dist-pyvows"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Unidecode \
python313-gevent \
python313-preggy"

inherit rpm
