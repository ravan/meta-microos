SUMMARY = "Pure Python module to hyphenate text"
DESCRIPTION = "Pyphen is a pure Python module to hyphenate text using existing Hunspell \
hyphenation dictionaries. \
 \
This module is a fork of python-hyphenator, written by Wilbert Berendsen."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MPL-1.1"

PV = "0.17.2"

RPM_NAME = "python313-Pyphen-0.17.2-1.7.noarch.rpm"
RPM_HASH = "49cab487268a8329c45584e1610f6319c1dba18206a49d9051e5614aa0e35a5498fe21f30c253ae508d9682de062918556dc1a7e07b9358999ab468c88615686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pyphen \
python3.13dist-pyphen \
python313-Pyphen \
python3dist-pyphen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
