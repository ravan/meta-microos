SUMMARY = "Translations for package libgedit-gtksourceview"
DESCRIPTION = "Provides translations for the 'libgedit-gtksourceview' package."
LICENSE = "LGPL-2.1-or-later"

PV = "299.7.1"

RPM_NAME = "libgedit-gtksourceview-lang-299.7.1-1.1.noarch.rpm"
RPM_HASH = "4846e7ec99a9936d344af9fcd889a7fa980e2a6f574d2f1c2c3e9645dfaf4ffb600845ae1a3756ac86069d5645d31f1aecb8a8d7f87cfd2c226faca53166e7c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgedit-gtksourceview-lang \
libgedit-gtksourceview-lang-all \
locale-libgedit-gtksourceview-ar \
locale-libgedit-gtksourceview-as \
locale-libgedit-gtksourceview-ast \
locale-libgedit-gtksourceview-az \
locale-libgedit-gtksourceview-be \
locale-libgedit-gtksourceview-bg \
locale-libgedit-gtksourceview-bn \
locale-libgedit-gtksourceview-bn-IN \
locale-libgedit-gtksourceview-bs \
locale-libgedit-gtksourceview-ca \
locale-libgedit-gtksourceview-ca@valencia \
locale-libgedit-gtksourceview-cs \
locale-libgedit-gtksourceview-cy \
locale-libgedit-gtksourceview-da \
locale-libgedit-gtksourceview-de \
locale-libgedit-gtksourceview-dz \
locale-libgedit-gtksourceview-el \
locale-libgedit-gtksourceview-en-CA \
locale-libgedit-gtksourceview-en-GB \
locale-libgedit-gtksourceview-en@shaw \
locale-libgedit-gtksourceview-eo \
locale-libgedit-gtksourceview-es \
locale-libgedit-gtksourceview-et \
locale-libgedit-gtksourceview-eu \
locale-libgedit-gtksourceview-fa \
locale-libgedit-gtksourceview-fi \
locale-libgedit-gtksourceview-fr \
locale-libgedit-gtksourceview-fur \
locale-libgedit-gtksourceview-ga \
locale-libgedit-gtksourceview-gl \
locale-libgedit-gtksourceview-gu \
locale-libgedit-gtksourceview-he \
locale-libgedit-gtksourceview-hi \
locale-libgedit-gtksourceview-hr \
locale-libgedit-gtksourceview-hu \
locale-libgedit-gtksourceview-id \
locale-libgedit-gtksourceview-it \
locale-libgedit-gtksourceview-ja \
locale-libgedit-gtksourceview-ka \
locale-libgedit-gtksourceview-kk \
locale-libgedit-gtksourceview-kn \
locale-libgedit-gtksourceview-ko \
locale-libgedit-gtksourceview-lt \
locale-libgedit-gtksourceview-lv \
locale-libgedit-gtksourceview-mai \
locale-libgedit-gtksourceview-mk \
locale-libgedit-gtksourceview-ml \
locale-libgedit-gtksourceview-mr \
locale-libgedit-gtksourceview-ms \
locale-libgedit-gtksourceview-nb \
locale-libgedit-gtksourceview-ne \
locale-libgedit-gtksourceview-nl \
locale-libgedit-gtksourceview-nn \
locale-libgedit-gtksourceview-oc \
locale-libgedit-gtksourceview-or \
locale-libgedit-gtksourceview-pa \
locale-libgedit-gtksourceview-pl \
locale-libgedit-gtksourceview-pt \
locale-libgedit-gtksourceview-pt-BR \
locale-libgedit-gtksourceview-ro \
locale-libgedit-gtksourceview-ru \
locale-libgedit-gtksourceview-si \
locale-libgedit-gtksourceview-sk \
locale-libgedit-gtksourceview-sl \
locale-libgedit-gtksourceview-sq \
locale-libgedit-gtksourceview-sr \
locale-libgedit-gtksourceview-sr@latin \
locale-libgedit-gtksourceview-sv \
locale-libgedit-gtksourceview-ta \
locale-libgedit-gtksourceview-te \
locale-libgedit-gtksourceview-th \
locale-libgedit-gtksourceview-tr \
locale-libgedit-gtksourceview-ug \
locale-libgedit-gtksourceview-uk \
locale-libgedit-gtksourceview-vi \
locale-libgedit-gtksourceview-zh-CN \
locale-libgedit-gtksourceview-zh-HK \
locale-libgedit-gtksourceview-zh-TW"

RDEPENDS:${PN} += "libgedit-gtksourceview"

inherit rpm
