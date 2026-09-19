SUMMARY = "Translations for package geany-plugins"
DESCRIPTION = "Provides translations for the 'geany-plugins' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "geany-plugins-lang-2.1-2.5.noarch.rpm"
RPM_HASH = "67de9583e4c5aa8cff2cd5c1a1ddb9e70cd0d5470da64810401e35f53aad854336532d6a3094255292b6ca5bbf4ef30a6d906564189d31beca504786aada2545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geany-plugins-lang \
geany-plugins-lang-all \
locale-geany-plugins-be \
locale-geany-plugins-ca \
locale-geany-plugins-da \
locale-geany-plugins-de \
locale-geany-plugins-el \
locale-geany-plugins-es \
locale-geany-plugins-fr \
locale-geany-plugins-gl \
locale-geany-plugins-it \
locale-geany-plugins-ja \
locale-geany-plugins-kk \
locale-geany-plugins-nl \
locale-geany-plugins-pt \
locale-geany-plugins-pt-BR \
locale-geany-plugins-ru \
locale-geany-plugins-tr \
locale-geany-plugins-uk \
locale-geany-plugins-zh-CN"

RDEPENDS:${PN} += "geany-plugins"

inherit rpm
