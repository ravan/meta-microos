SUMMARY = "Translations for package liquidshell"
DESCRIPTION = "Provides translations for the 'liquidshell' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.1"

RPM_NAME = "liquidshell-lang-1.10.1-1.5.noarch.rpm"
RPM_HASH = "c651843b3d8c9c4b12c360aca11db49d204cb583bf5fb43c32adfd6265cff70d2381f036615466fad0b7008fa9c7ea32d8cf7b9ad832121f110eb4af55607eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liquidshell-lang \
liquidshell-lang-all \
locale-liquidshell-ar \
locale-liquidshell-ca \
locale-liquidshell-ca@valencia \
locale-liquidshell-cs \
locale-liquidshell-de \
locale-liquidshell-el \
locale-liquidshell-en-GB \
locale-liquidshell-eo \
locale-liquidshell-es \
locale-liquidshell-et \
locale-liquidshell-eu \
locale-liquidshell-fi \
locale-liquidshell-fr \
locale-liquidshell-ga \
locale-liquidshell-gl \
locale-liquidshell-he \
locale-liquidshell-ia \
locale-liquidshell-it \
locale-liquidshell-ja \
locale-liquidshell-ka \
locale-liquidshell-ko \
locale-liquidshell-lt \
locale-liquidshell-lv \
locale-liquidshell-nl \
locale-liquidshell-pl \
locale-liquidshell-pt \
locale-liquidshell-pt-BR \
locale-liquidshell-ru \
locale-liquidshell-sk \
locale-liquidshell-sl \
locale-liquidshell-sv \
locale-liquidshell-tr \
locale-liquidshell-uk \
locale-liquidshell-zh-CN \
locale-liquidshell-zh-TW"

RDEPENDS:${PN} += "liquidshell"

inherit rpm
