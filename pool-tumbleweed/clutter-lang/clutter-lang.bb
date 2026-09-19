SUMMARY = "Translations for package clutter"
DESCRIPTION = "Provides translations for the 'clutter' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.4"

RPM_NAME = "clutter-lang-1.26.4-4.23.noarch.rpm"
RPM_HASH = "9899984fb066f127481419562c56ffa81655d9d822e469eac4686e01f8be16214729c8d91d98d28303cffc8bc86ef9c8939095388dd4a249a54927bd6b6d6d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clutter-lang \
clutter-lang-all \
locale-clutter-ar \
locale-clutter-as \
locale-clutter-ast \
locale-clutter-be \
locale-clutter-bg \
locale-clutter-bs \
locale-clutter-ca \
locale-clutter-ca@valencia \
locale-clutter-cs \
locale-clutter-da \
locale-clutter-de \
locale-clutter-el \
locale-clutter-en-GB \
locale-clutter-eo \
locale-clutter-es \
locale-clutter-eu \
locale-clutter-fa \
locale-clutter-fi \
locale-clutter-fr \
locale-clutter-fur \
locale-clutter-gl \
locale-clutter-he \
locale-clutter-hi \
locale-clutter-hr \
locale-clutter-hu \
locale-clutter-id \
locale-clutter-it \
locale-clutter-ja \
locale-clutter-kk \
locale-clutter-km \
locale-clutter-kn \
locale-clutter-ko \
locale-clutter-lt \
locale-clutter-lv \
locale-clutter-mk \
locale-clutter-ml \
locale-clutter-nb \
locale-clutter-ne \
locale-clutter-nl \
locale-clutter-oc \
locale-clutter-or \
locale-clutter-pa \
locale-clutter-pl \
locale-clutter-pt \
locale-clutter-pt-BR \
locale-clutter-ro \
locale-clutter-ru \
locale-clutter-sk \
locale-clutter-sl \
locale-clutter-sr \
locale-clutter-sr@latin \
locale-clutter-sv \
locale-clutter-ta \
locale-clutter-te \
locale-clutter-tr \
locale-clutter-ug \
locale-clutter-uk \
locale-clutter-zh-CN \
locale-clutter-zh-HK \
locale-clutter-zh-TW"

RDEPENDS:${PN} += "clutter"

inherit rpm
