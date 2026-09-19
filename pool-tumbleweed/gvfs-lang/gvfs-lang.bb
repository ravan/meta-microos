SUMMARY = "Translations for package gvfs"
DESCRIPTION = "Provides translations for the 'gvfs' package."
LICENSE = "GPL-3.0-only & LGPL-2.0-or-later"

PV = "1.60.3"

RPM_NAME = "gvfs-lang-1.60.3-1.1.noarch.rpm"
RPM_HASH = "bb44f22613ee470d6d5b6cc694d6839b1e810270d76e703f89d8f9730148c5695f37a4f8b0e778d367de0741ef857a487a17d3ebc606e5cb5f40ffa9d7f989ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gvfs-lang \
gvfs-lang-all \
locale-gvfs-af \
locale-gvfs-ar \
locale-gvfs-as \
locale-gvfs-ast \
locale-gvfs-be \
locale-gvfs-be@latin \
locale-gvfs-bg \
locale-gvfs-bn \
locale-gvfs-bn-IN \
locale-gvfs-bs \
locale-gvfs-ca \
locale-gvfs-ca@valencia \
locale-gvfs-cs \
locale-gvfs-da \
locale-gvfs-de \
locale-gvfs-el \
locale-gvfs-en-GB \
locale-gvfs-en@shaw \
locale-gvfs-eo \
locale-gvfs-es \
locale-gvfs-et \
locale-gvfs-eu \
locale-gvfs-fa \
locale-gvfs-fi \
locale-gvfs-fr \
locale-gvfs-fur \
locale-gvfs-ga \
locale-gvfs-gl \
locale-gvfs-gu \
locale-gvfs-he \
locale-gvfs-hi \
locale-gvfs-hr \
locale-gvfs-hu \
locale-gvfs-id \
locale-gvfs-it \
locale-gvfs-ja \
locale-gvfs-ka \
locale-gvfs-kk \
locale-gvfs-kn \
locale-gvfs-ko \
locale-gvfs-lt \
locale-gvfs-lv \
locale-gvfs-mai \
locale-gvfs-mk \
locale-gvfs-ml \
locale-gvfs-mr \
locale-gvfs-ms \
locale-gvfs-nb \
locale-gvfs-nds \
locale-gvfs-ne \
locale-gvfs-nl \
locale-gvfs-nn \
locale-gvfs-oc \
locale-gvfs-or \
locale-gvfs-pa \
locale-gvfs-pl \
locale-gvfs-pt \
locale-gvfs-pt-BR \
locale-gvfs-ro \
locale-gvfs-ru \
locale-gvfs-sk \
locale-gvfs-sl \
locale-gvfs-sq \
locale-gvfs-sr \
locale-gvfs-sr@latin \
locale-gvfs-sv \
locale-gvfs-ta \
locale-gvfs-te \
locale-gvfs-th \
locale-gvfs-tr \
locale-gvfs-ug \
locale-gvfs-uk \
locale-gvfs-vi \
locale-gvfs-zh-CN \
locale-gvfs-zh-HK \
locale-gvfs-zh-TW"

RDEPENDS:${PN} += "gvfs"

inherit rpm
