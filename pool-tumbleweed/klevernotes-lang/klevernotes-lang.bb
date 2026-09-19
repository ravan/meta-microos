SUMMARY = "Translations for package klevernotes"
DESCRIPTION = "Provides translations for the 'klevernotes' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "klevernotes-lang-1.3.1-1.4.noarch.rpm"
RPM_HASH = "ee02c43edcbaa2ee565a2688549e05c0b4274cf5c7534e730df6420b7bbbbd45439e366f2b742b67c4acf74b2c62a344b2d9bbfd8bb7255f1ffab3be3147efa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klevernotes-lang \
klevernotes-lang-all \
locale-klevernotes-ar \
locale-klevernotes-ca \
locale-klevernotes-ca@valencia \
locale-klevernotes-cs \
locale-klevernotes-de \
locale-klevernotes-en-GB \
locale-klevernotes-eo \
locale-klevernotes-es \
locale-klevernotes-eu \
locale-klevernotes-fi \
locale-klevernotes-fr \
locale-klevernotes-ga \
locale-klevernotes-gl \
locale-klevernotes-he \
locale-klevernotes-hi \
locale-klevernotes-ia \
locale-klevernotes-it \
locale-klevernotes-ja \
locale-klevernotes-ka \
locale-klevernotes-ko \
locale-klevernotes-lt \
locale-klevernotes-nl \
locale-klevernotes-pl \
locale-klevernotes-pt \
locale-klevernotes-pt-BR \
locale-klevernotes-sk \
locale-klevernotes-sl \
locale-klevernotes-sv \
locale-klevernotes-tr \
locale-klevernotes-uk \
locale-klevernotes-zh-CN \
locale-klevernotes-zh-TW"

RDEPENDS:${PN} += "klevernotes"

inherit rpm
