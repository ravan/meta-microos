SUMMARY = "Python bindings for the Enchant spellchecking system"
DESCRIPTION = "PyEnchant is a spellchecking library for Python, based on the excellent Enchant library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.0"

RPM_NAME = "python313-pyenchant-3.3.0-2.4.noarch.rpm"
RPM_HASH = "e4d47061c7219b130b5fbd1d8ed39a853f60eca6874c61d00a68e549bb57a4f3f6e562028e7cd42b861c5a1af7a58339146acc0d6bc76608b95054d7cd1741a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enchant \
python3-pyenchant \
python3.13dist-pyenchant \
python313-enchant \
python313-pyenchant \
python3dist-pyenchant"

RDEPENDS:${PN} += "enchant-2-backend-hunspell \
python-abi"

inherit rpm
