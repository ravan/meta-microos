SUMMARY = "Translations for package a2ps"
DESCRIPTION = "Provides translations for the 'a2ps' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.8"

RPM_NAME = "a2ps-lang-4.15.8-1.1.noarch.rpm"
RPM_HASH = "68f8daf44934c752d35d0a5c94852425eceefa35815cb18a99c97d09e97bdd07ae5fc60704d224c75966a45d8416abf8e38ee22da9ab31e193da4b02622ca785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "a2ps-lang \
a2ps-lang-all \
locale-a2ps-af \
locale-a2ps-be \
locale-a2ps-bg \
locale-a2ps-ca \
locale-a2ps-cs \
locale-a2ps-da \
locale-a2ps-de \
locale-a2ps-el \
locale-a2ps-en-GB \
locale-a2ps-eo \
locale-a2ps-es \
locale-a2ps-et \
locale-a2ps-eu \
locale-a2ps-fi \
locale-a2ps-fr \
locale-a2ps-ga \
locale-a2ps-gl \
locale-a2ps-hr \
locale-a2ps-hu \
locale-a2ps-id \
locale-a2ps-it \
locale-a2ps-ja \
locale-a2ps-ka \
locale-a2ps-ko \
locale-a2ps-ms \
locale-a2ps-nb \
locale-a2ps-nl \
locale-a2ps-pl \
locale-a2ps-pt \
locale-a2ps-pt-BR \
locale-a2ps-ro \
locale-a2ps-ru \
locale-a2ps-sk \
locale-a2ps-sl \
locale-a2ps-sr \
locale-a2ps-sv \
locale-a2ps-th \
locale-a2ps-tr \
locale-a2ps-uk \
locale-a2ps-vi \
locale-a2ps-zh-CN \
locale-a2ps-zh-TW"

RDEPENDS:${PN} += "a2ps"

inherit rpm
