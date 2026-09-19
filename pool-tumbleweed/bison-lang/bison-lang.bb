SUMMARY = "Translations for package bison"
DESCRIPTION = "Provides translations for the 'bison' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "bison-lang-3.8.2-4.1.noarch.rpm"
RPM_HASH = "bcd91288c662cfa6ff560c5bbb0453d46b72d30c52e87a4404faedb2d78cb9e4b58a9c80231b02c512167c1d8bf20098cfa5da145e0fa8a2243e9b60c5e3b4ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bison-lang \
bison-lang-all \
locale-bison-af \
locale-bison-ast \
locale-bison-be \
locale-bison-bg \
locale-bison-ca \
locale-bison-cs \
locale-bison-da \
locale-bison-de \
locale-bison-el \
locale-bison-eo \
locale-bison-es \
locale-bison-et \
locale-bison-eu \
locale-bison-fi \
locale-bison-fr \
locale-bison-ga \
locale-bison-gl \
locale-bison-hr \
locale-bison-hu \
locale-bison-ia \
locale-bison-id \
locale-bison-it \
locale-bison-ja \
locale-bison-ko \
locale-bison-lt \
locale-bison-lv \
locale-bison-ms \
locale-bison-nb \
locale-bison-nl \
locale-bison-pl \
locale-bison-pt \
locale-bison-pt-BR \
locale-bison-ro \
locale-bison-ru \
locale-bison-sk \
locale-bison-sl \
locale-bison-sq \
locale-bison-sr \
locale-bison-sv \
locale-bison-ta \
locale-bison-th \
locale-bison-tr \
locale-bison-uk \
locale-bison-vi \
locale-bison-zh-CN \
locale-bison-zh-TW"

RDEPENDS:${PN} += "bison"

inherit rpm
