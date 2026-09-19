SUMMARY = "Translations for package remake"
DESCRIPTION = "Provides translations for the 'remake' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.3_1.6"

RPM_NAME = "remake-lang-4.3_1.6-1.3.noarch.rpm"
RPM_HASH = "58ad3cfe38c72f5054077307c6666b26273e5f98f60a693171913b3c6dd5c018daa6a66ce914f969fce07e3bf5d171670581ecf3aa60b2f3cc86c79f9bd954f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-remake-be \
locale-remake-bg \
locale-remake-cs \
locale-remake-da \
locale-remake-de \
locale-remake-es \
locale-remake-fi \
locale-remake-fr \
locale-remake-ga \
locale-remake-gl \
locale-remake-he \
locale-remake-hr \
locale-remake-id \
locale-remake-it \
locale-remake-ja \
locale-remake-ko \
locale-remake-lt \
locale-remake-nl \
locale-remake-pl \
locale-remake-pt \
locale-remake-pt-BR \
locale-remake-ru \
locale-remake-sr \
locale-remake-sv \
locale-remake-tr \
locale-remake-uk \
locale-remake-vi \
locale-remake-zh-CN \
locale-remake-zh-TW \
remake-lang \
remake-lang-all"

RDEPENDS:${PN} += "remake"

inherit rpm
