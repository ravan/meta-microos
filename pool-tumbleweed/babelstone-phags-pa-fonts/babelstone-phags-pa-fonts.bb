SUMMARY = "Font for Phags Pa Script"
DESCRIPTION = "BabelStone Phags-pa Book, BabelStone Phags-pa Tibetan A and BabelStone \
Phags-pa Tibetan B are different styles of Phags-pa fonts, with OpenType \
features that allow complex joining and shaping behaviour."
LICENSE = "OFL-1.1"

PV = "2.0"

RPM_NAME = "babelstone-phags-pa-fonts-2.0-3.25.noarch.rpm"
RPM_HASH = "5d7f67a0d234753c0cc1e9bc89c774eb55e8014dd0dd18de1b53912ffb9a726ebe53c6ea21e5f68315b4405240a01b4e368fc288fbdf814f0b95a634eaec5d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-phags-pa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
