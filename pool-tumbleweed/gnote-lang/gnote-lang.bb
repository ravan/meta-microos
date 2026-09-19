SUMMARY = "Translations for package gnote"
DESCRIPTION = "Provides translations for the 'gnote' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.2"

RPM_NAME = "gnote-lang-50.2-1.1.noarch.rpm"
RPM_HASH = "4d20cdb53611e0d957bb857ec6d0b00bdaceb49fb1d1c4e416f2249188f47b5ad98ec2229f78107a1111f2bc61dd6c7907e1d479021f4948a95dc50a2dd7a2fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnote-lang \
gnote-lang-all \
locale-gnote-ar \
locale-gnote-as \
locale-gnote-bg \
locale-gnote-bn-IN \
locale-gnote-bs \
locale-gnote-ca \
locale-gnote-ca@valencia \
locale-gnote-cs \
locale-gnote-da \
locale-gnote-de \
locale-gnote-el \
locale-gnote-en-GB \
locale-gnote-eo \
locale-gnote-es \
locale-gnote-eu \
locale-gnote-fi \
locale-gnote-fr \
locale-gnote-gl \
locale-gnote-gu \
locale-gnote-he \
locale-gnote-hi \
locale-gnote-hu \
locale-gnote-id \
locale-gnote-it \
locale-gnote-ja \
locale-gnote-ka \
locale-gnote-kk \
locale-gnote-kn \
locale-gnote-ko \
locale-gnote-lt \
locale-gnote-lv \
locale-gnote-ml \
locale-gnote-mr \
locale-gnote-nb \
locale-gnote-ne \
locale-gnote-nl \
locale-gnote-oc \
locale-gnote-or \
locale-gnote-pa \
locale-gnote-pl \
locale-gnote-pt \
locale-gnote-pt-BR \
locale-gnote-ro \
locale-gnote-ru \
locale-gnote-sk \
locale-gnote-sl \
locale-gnote-sr \
locale-gnote-sr@latin \
locale-gnote-sv \
locale-gnote-ta \
locale-gnote-te \
locale-gnote-th \
locale-gnote-tr \
locale-gnote-uk \
locale-gnote-zh-CN \
locale-gnote-zh-HK \
locale-gnote-zh-TW"

RDEPENDS:${PN} += "gnote"

inherit rpm
