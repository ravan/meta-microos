SUMMARY = "Translations for package amsynth"
DESCRIPTION = "Provides translations for the 'amsynth' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "amsynth-lang-2.0.0-1.1.noarch.rpm"
RPM_HASH = "5f2f8ac44b89d8477bbea4991ef604e709bfe89511b408b19dc9ac7e1f217f083de094f51de042491db95f83329c1eccdb9c505e658b7e186e29619e05b0376b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amsynth-lang \
amsynth-lang-all \
locale-amsynth-de \
locale-amsynth-fr \
locale-amsynth-ka"

RDEPENDS:${PN} += "amsynth"

inherit rpm
