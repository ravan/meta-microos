SUMMARY = "Translations for package encfs"
DESCRIPTION = "Provides translations for the 'encfs' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.9.5"

RPM_NAME = "encfs-lang-1.9.5-4.6.noarch.rpm"
RPM_HASH = "7579064aa0bf8b6a20efd9a78e42a2ccbdcd5eaabf8cef8e636bf7b779a21f15251b68320518f81a15680923c5643437486614838e628d2007b21047eed8e6e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "encfs-lang \
encfs-lang-all \
locale-encfs-ar \
locale-encfs-be \
locale-encfs-bg \
locale-encfs-bs \
locale-encfs-ca \
locale-encfs-cs \
locale-encfs-da \
locale-encfs-de \
locale-encfs-de-AT \
locale-encfs-de-CH \
locale-encfs-de-DE \
locale-encfs-el \
locale-encfs-eo \
locale-encfs-es \
locale-encfs-es-ES \
locale-encfs-es-PE \
locale-encfs-et \
locale-encfs-fi \
locale-encfs-fr \
locale-encfs-fr-FR \
locale-encfs-gl \
locale-encfs-he \
locale-encfs-hr \
locale-encfs-hu \
locale-encfs-id \
locale-encfs-it \
locale-encfs-ja \
locale-encfs-ko \
locale-encfs-lv \
locale-encfs-nb \
locale-encfs-nds \
locale-encfs-nl \
locale-encfs-nn \
locale-encfs-oc \
locale-encfs-pl \
locale-encfs-pt \
locale-encfs-pt-BR \
locale-encfs-pt-PT \
locale-encfs-ro \
locale-encfs-ru \
locale-encfs-sk \
locale-encfs-sr \
locale-encfs-sv \
locale-encfs-ta \
locale-encfs-tr \
locale-encfs-uk \
locale-encfs-vi \
locale-encfs-zh-CN \
locale-encfs-zh-HK \
locale-encfs-zh-TW"

RDEPENDS:${PN} += "encfs"

inherit rpm
