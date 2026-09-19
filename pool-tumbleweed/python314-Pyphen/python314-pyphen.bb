SUMMARY = "Pure Python module to hyphenate text"
DESCRIPTION = "Pyphen is a pure Python module to hyphenate text using existing Hunspell \
hyphenation dictionaries. \
 \
This module is a fork of python-hyphenator, written by Wilbert Berendsen."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MPL-1.1"

PV = "0.17.2"

RPM_NAME = "python314-Pyphen-0.17.2-1.7.noarch.rpm"
RPM_HASH = "794987ffc7c2dad3108077f501388ab7d8d50fa366acd20dd8a9ce8f7ef6cd244347ab1b7deb1ec09178f2414e24a87d490c2bf3d4bc26fc8cd6c932969ca945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyphen \
python314-Pyphen \
python3dist-pyphen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
