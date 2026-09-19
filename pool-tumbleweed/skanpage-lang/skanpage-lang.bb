SUMMARY = "Translations for package skanpage"
DESCRIPTION = "Provides translations for the 'skanpage' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "skanpage-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "33b1f005e2ee3bcb16d77c9eeefdd7c22744e374c3f5631aff0503b9c21f1fc496c307fd9b71a3146058163f7121267eed3d1100f4a01c4c41f9f41ba1b80403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skanpage-ar \
locale-skanpage-ast \
locale-skanpage-az \
locale-skanpage-be \
locale-skanpage-bg \
locale-skanpage-ca \
locale-skanpage-ca@valencia \
locale-skanpage-cs \
locale-skanpage-de \
locale-skanpage-el \
locale-skanpage-en-GB \
locale-skanpage-eo \
locale-skanpage-es \
locale-skanpage-eu \
locale-skanpage-fi \
locale-skanpage-fr \
locale-skanpage-ga \
locale-skanpage-gl \
locale-skanpage-he \
locale-skanpage-hi \
locale-skanpage-hu \
locale-skanpage-ia \
locale-skanpage-id \
locale-skanpage-is \
locale-skanpage-it \
locale-skanpage-ja \
locale-skanpage-ka \
locale-skanpage-ko \
locale-skanpage-lt \
locale-skanpage-lv \
locale-skanpage-nb \
locale-skanpage-nl \
locale-skanpage-pa \
locale-skanpage-pl \
locale-skanpage-pt \
locale-skanpage-pt-BR \
locale-skanpage-ro \
locale-skanpage-ru \
locale-skanpage-sk \
locale-skanpage-sl \
locale-skanpage-sv \
locale-skanpage-tr \
locale-skanpage-ug \
locale-skanpage-uk \
locale-skanpage-zh-CN \
locale-skanpage-zh-TW \
skanpage-lang \
skanpage-lang-all"

RDEPENDS:${PN} += "skanpage"

inherit rpm
