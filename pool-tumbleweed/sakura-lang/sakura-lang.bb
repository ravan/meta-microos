SUMMARY = "Translations for package sakura"
DESCRIPTION = "Provides translations for the 'sakura' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.9"

RPM_NAME = "sakura-lang-3.8.9-2.3.noarch.rpm"
RPM_HASH = "535f1b9917566075837bd737bace40a85c68d0e31e4bd7e08f15a7ad6cc9010c17973799fac47fdb7d46ed3d2fc3c19f1b13c0426aede9b5607fc3c961b99039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sakura-ca \
locale-sakura-cs \
locale-sakura-de \
locale-sakura-en-GB \
locale-sakura-es \
locale-sakura-fr \
locale-sakura-he \
locale-sakura-hr \
locale-sakura-hu \
locale-sakura-it \
locale-sakura-ja \
locale-sakura-ko \
locale-sakura-pl \
locale-sakura-pt \
locale-sakura-pt-BR \
locale-sakura-ru \
locale-sakura-sv \
locale-sakura-tr \
locale-sakura-uk \
locale-sakura-zh-CN \
sakura-lang \
sakura-lang-all"

RDEPENDS:${PN} += "sakura"

inherit rpm
