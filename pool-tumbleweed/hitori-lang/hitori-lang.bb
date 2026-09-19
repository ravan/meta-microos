SUMMARY = "Translations for package hitori"
DESCRIPTION = "Provides translations for the 'hitori' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "hitori-lang-44.0-1.15.noarch.rpm"
RPM_HASH = "1b5b6be0e55965afe78f3e2bb799108713c963448fcc3bffaac6cd4093fc71a1161e03b8870b1b3f45c33b37a7dc58ecebc4ff481889d68fa279971a5c8655b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hitori-lang \
hitori-lang-all \
locale-hitori-ar \
locale-hitori-as \
locale-hitori-be \
locale-hitori-bg \
locale-hitori-bs \
locale-hitori-ca \
locale-hitori-ca@valencia \
locale-hitori-cs \
locale-hitori-da \
locale-hitori-de \
locale-hitori-el \
locale-hitori-en-GB \
locale-hitori-eo \
locale-hitori-es \
locale-hitori-eu \
locale-hitori-fa \
locale-hitori-fi \
locale-hitori-fr \
locale-hitori-fur \
locale-hitori-gl \
locale-hitori-he \
locale-hitori-hr \
locale-hitori-hu \
locale-hitori-id \
locale-hitori-it \
locale-hitori-ja \
locale-hitori-ka \
locale-hitori-kk \
locale-hitori-ko \
locale-hitori-lt \
locale-hitori-lv \
locale-hitori-ml \
locale-hitori-ms \
locale-hitori-nb \
locale-hitori-ne \
locale-hitori-nl \
locale-hitori-oc \
locale-hitori-pa \
locale-hitori-pl \
locale-hitori-pt \
locale-hitori-pt-BR \
locale-hitori-ro \
locale-hitori-ru \
locale-hitori-sk \
locale-hitori-sl \
locale-hitori-sr \
locale-hitori-sr@latin \
locale-hitori-sv \
locale-hitori-tr \
locale-hitori-uk \
locale-hitori-vi \
locale-hitori-zh-CN \
locale-hitori-zh-HK \
locale-hitori-zh-TW"

RDEPENDS:${PN} += "hitori"

inherit rpm
