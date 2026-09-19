SUMMARY = "Translations for package avogadro"
DESCRIPTION = "Provides translations for the 'avogadro' package."
LICENSE = "GPL-2.0-only"

PV = "1.100.0"

RPM_NAME = "avogadro-lang-1.100.0-1.7.noarch.rpm"
RPM_HASH = "11b55846a19333e070b9ab68d91f554d9cd4da661088048b5eecf533c0024625fd8a4c1d720bdeba0249caffe19ca2e9928c7c2d88cd481e5cc28ef34e9598be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avogadro-lang \
avogadro-lang-all"

RDEPENDS:${PN} += "avogadro"

inherit rpm
