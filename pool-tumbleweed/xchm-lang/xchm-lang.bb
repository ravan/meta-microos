SUMMARY = "Translations for package xchm"
DESCRIPTION = "Provides translations for the 'xchm' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.39"

RPM_NAME = "xchm-lang-1.39-1.2.noarch.rpm"
RPM_HASH = "8a5a80adfeed5e4d2ff783de46d2da954027fe52536028964763c26929172e4ea11bab4c81cf608dc659cd4d2f21e44505ad854bb1372c43f0047ddba067ee92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xchm-be \
locale-xchm-bg \
locale-xchm-cs \
locale-xchm-de \
locale-xchm-el \
locale-xchm-es \
locale-xchm-fr \
locale-xchm-hu \
locale-xchm-it \
locale-xchm-ka \
locale-xchm-lv \
locale-xchm-pl \
locale-xchm-pt-BR \
locale-xchm-pt-PT \
locale-xchm-ro \
locale-xchm-ru \
locale-xchm-sk \
locale-xchm-sv \
locale-xchm-uk \
locale-xchm-zh-CN \
locale-xchm-zh-TW \
xchm-lang \
xchm-lang-all"

RDEPENDS:${PN} += "xchm"

inherit rpm
