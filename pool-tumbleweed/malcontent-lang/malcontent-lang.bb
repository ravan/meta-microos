SUMMARY = "Translations for package malcontent"
DESCRIPTION = "Provides translations for the 'malcontent' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.1"

RPM_NAME = "malcontent-lang-0.13.1-1.6.noarch.rpm"
RPM_HASH = "0aa5781ab45e17a22265b22fbdfedf8b831d8eb4daccfe612625a7a311a535e66fab0d3e448175128e4274d90fe3b8e439cfaf08a3026fd539d21d344590564c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-malcontent-af \
locale-malcontent-ar \
locale-malcontent-bg \
locale-malcontent-bn \
locale-malcontent-ca \
locale-malcontent-ca@valencia \
locale-malcontent-cs \
locale-malcontent-da \
locale-malcontent-de \
locale-malcontent-el \
locale-malcontent-eo \
locale-malcontent-es \
locale-malcontent-eu \
locale-malcontent-fa \
locale-malcontent-fi \
locale-malcontent-fr \
locale-malcontent-fur \
locale-malcontent-gd \
locale-malcontent-gl \
locale-malcontent-he \
locale-malcontent-hi \
locale-malcontent-hr \
locale-malcontent-hu \
locale-malcontent-id \
locale-malcontent-it \
locale-malcontent-ka \
locale-malcontent-kk \
locale-malcontent-ko \
locale-malcontent-lt \
locale-malcontent-lv \
locale-malcontent-ml \
locale-malcontent-ms \
locale-malcontent-nb \
locale-malcontent-nl \
locale-malcontent-oc \
locale-malcontent-pa \
locale-malcontent-pl \
locale-malcontent-pt \
locale-malcontent-pt-BR \
locale-malcontent-ro \
locale-malcontent-ru \
locale-malcontent-sk \
locale-malcontent-sl \
locale-malcontent-sr \
locale-malcontent-sr@latin \
locale-malcontent-sv \
locale-malcontent-th \
locale-malcontent-tr \
locale-malcontent-uk \
locale-malcontent-vi \
locale-malcontent-zh-CN \
locale-malcontent-zh-TW \
malcontent-lang \
malcontent-lang-all"

RDEPENDS:${PN} += "malcontent"

inherit rpm
