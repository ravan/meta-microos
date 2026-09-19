SUMMARY = "Translations for package plasma6-thunderbolt"
DESCRIPTION = "Provides translations for the 'plasma6-thunderbolt' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-thunderbolt-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "980186ba3e04d6dc5f5cb6b63b0a84df054eb7dbc57a63be8b927d3c2ff2ff3644872b39cd5a9da2b5589a0b007fce784f48c0fcc75d6bd888e2950d56d4a025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-thunderbolt-ar \
locale-plasma6-thunderbolt-ast \
locale-plasma6-thunderbolt-az \
locale-plasma6-thunderbolt-be \
locale-plasma6-thunderbolt-bg \
locale-plasma6-thunderbolt-ca \
locale-plasma6-thunderbolt-ca@valencia \
locale-plasma6-thunderbolt-cs \
locale-plasma6-thunderbolt-da \
locale-plasma6-thunderbolt-de \
locale-plasma6-thunderbolt-en-GB \
locale-plasma6-thunderbolt-eo \
locale-plasma6-thunderbolt-es \
locale-plasma6-thunderbolt-et \
locale-plasma6-thunderbolt-eu \
locale-plasma6-thunderbolt-fi \
locale-plasma6-thunderbolt-fr \
locale-plasma6-thunderbolt-ga \
locale-plasma6-thunderbolt-gl \
locale-plasma6-thunderbolt-he \
locale-plasma6-thunderbolt-hi \
locale-plasma6-thunderbolt-hu \
locale-plasma6-thunderbolt-ia \
locale-plasma6-thunderbolt-id \
locale-plasma6-thunderbolt-is \
locale-plasma6-thunderbolt-it \
locale-plasma6-thunderbolt-ja \
locale-plasma6-thunderbolt-ka \
locale-plasma6-thunderbolt-ko \
locale-plasma6-thunderbolt-lt \
locale-plasma6-thunderbolt-lv \
locale-plasma6-thunderbolt-ml \
locale-plasma6-thunderbolt-nl \
locale-plasma6-thunderbolt-nn \
locale-plasma6-thunderbolt-pa \
locale-plasma6-thunderbolt-pl \
locale-plasma6-thunderbolt-pt \
locale-plasma6-thunderbolt-pt-BR \
locale-plasma6-thunderbolt-ro \
locale-plasma6-thunderbolt-ru \
locale-plasma6-thunderbolt-sk \
locale-plasma6-thunderbolt-sl \
locale-plasma6-thunderbolt-sv \
locale-plasma6-thunderbolt-tr \
locale-plasma6-thunderbolt-uk \
locale-plasma6-thunderbolt-zh-CN \
locale-plasma6-thunderbolt-zh-TW \
plasma6-thunderbolt-lang \
plasma6-thunderbolt-lang-all"

RDEPENDS:${PN} += "plasma6-thunderbolt"

inherit rpm
