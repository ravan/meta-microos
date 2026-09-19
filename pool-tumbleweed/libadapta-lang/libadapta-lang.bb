SUMMARY = "Translations for package libadapta"
DESCRIPTION = "Provides translations for the 'libadapta' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "libadapta-lang-1.5.0-2.4.noarch.rpm"
RPM_HASH = "9d7f8e1ab5af40b5c8bf352bc0c7cd13103ab8e14e63eb1c589cd758c3f265d3d81143509f4914b0e1497fb97310438546444725274bdd624ae956fd95e408e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadapta-lang \
libadapta-lang-all \
locale-libadapta-be \
locale-libadapta-bg \
locale-libadapta-ca \
locale-libadapta-cs \
locale-libadapta-da \
locale-libadapta-de \
locale-libadapta-el \
locale-libadapta-en-GB \
locale-libadapta-eo \
locale-libadapta-es \
locale-libadapta-eu \
locale-libadapta-fa \
locale-libadapta-fi \
locale-libadapta-fr \
locale-libadapta-fur \
locale-libadapta-gl \
locale-libadapta-he \
locale-libadapta-hi \
locale-libadapta-hr \
locale-libadapta-hu \
locale-libadapta-id \
locale-libadapta-it \
locale-libadapta-ja \
locale-libadapta-ka \
locale-libadapta-kk \
locale-libadapta-ko \
locale-libadapta-lt \
locale-libadapta-lv \
locale-libadapta-ml \
locale-libadapta-nb \
locale-libadapta-ne \
locale-libadapta-nl \
locale-libadapta-oc \
locale-libadapta-pl \
locale-libadapta-pt \
locale-libadapta-pt-BR \
locale-libadapta-ro \
locale-libadapta-ru \
locale-libadapta-sk \
locale-libadapta-sl \
locale-libadapta-sr \
locale-libadapta-sv \
locale-libadapta-th \
locale-libadapta-tr \
locale-libadapta-uk \
locale-libadapta-vi \
locale-libadapta-zh-CN \
locale-libadapta-zh-TW"

RDEPENDS:${PN} += "libadapta"

inherit rpm
