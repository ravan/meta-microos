SUMMARY = "Python bindings for the Enchant spellchecking system"
DESCRIPTION = "PyEnchant is a spellchecking library for Python, based on the excellent Enchant library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.0"

RPM_NAME = "python314-pyenchant-3.3.0-2.4.noarch.rpm"
RPM_HASH = "b932fc1b28e58b588744aa61d23df49e0d084989213011e6199c64e257b74687b5c6fb94e50f1c26fc0a75a5ab9432d78a05ddce37176cd051ea9eca9f563466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyenchant \
python314-enchant \
python314-pyenchant \
python3dist-pyenchant"

RDEPENDS:${PN} += "enchant-2-backend-hunspell \
python-abi"

inherit rpm
