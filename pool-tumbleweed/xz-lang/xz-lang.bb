SUMMARY = "Translations for package xz"
DESCRIPTION = "Provides translations for the 'xz' package."
LICENSE = "0BSD & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "5.8.3"

RPM_NAME = "xz-lang-5.8.3-1.3.noarch.rpm"
RPM_HASH = "a7ea838ab85a5cee0469d8b3398b584875b6df88eda6641a801eb8416e8e2d106f8827ecee278802ff7cdd98441e54febd0ac02689da14f0af4821f7e8a629ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xz-ca \
locale-xz-cs \
locale-xz-da \
locale-xz-de \
locale-xz-eo \
locale-xz-es \
locale-xz-fi \
locale-xz-fr \
locale-xz-hr \
locale-xz-hu \
locale-xz-it \
locale-xz-ka \
locale-xz-ko \
locale-xz-nl \
locale-xz-pl \
locale-xz-pt \
locale-xz-pt-BR \
locale-xz-ro \
locale-xz-sr \
locale-xz-sv \
locale-xz-tr \
locale-xz-uk \
locale-xz-vi \
locale-xz-zh-CN \
locale-xz-zh-TW \
xz-lang \
xz-lang-all"

RDEPENDS:${PN} += "xz"

inherit rpm
