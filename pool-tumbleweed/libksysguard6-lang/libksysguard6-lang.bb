SUMMARY = "Translations for package libksysguard6"
DESCRIPTION = "Provides translations for the 'libksysguard6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libksysguard6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "17f95847789d6eb069335ea6e0a71b2110ce11c083266044b975811271210e253486fa078a22cd5d37ec156d5fbdff560ffa68d62ac06a2f5d3c14fd575a4049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libksysguard6-lang \
libksysguard6-lang-all \
locale-libksysguard6-ar \
locale-libksysguard6-ast \
locale-libksysguard6-az \
locale-libksysguard6-be \
locale-libksysguard6-bg \
locale-libksysguard6-bn-IN \
locale-libksysguard6-bs \
locale-libksysguard6-ca \
locale-libksysguard6-ca@valencia \
locale-libksysguard6-cs \
locale-libksysguard6-da \
locale-libksysguard6-de \
locale-libksysguard6-el \
locale-libksysguard6-en-GB \
locale-libksysguard6-eo \
locale-libksysguard6-es \
locale-libksysguard6-et \
locale-libksysguard6-eu \
locale-libksysguard6-fa \
locale-libksysguard6-fi \
locale-libksysguard6-fr \
locale-libksysguard6-ga \
locale-libksysguard6-gl \
locale-libksysguard6-gu \
locale-libksysguard6-he \
locale-libksysguard6-hi \
locale-libksysguard6-hr \
locale-libksysguard6-hu \
locale-libksysguard6-ia \
locale-libksysguard6-id \
locale-libksysguard6-is \
locale-libksysguard6-it \
locale-libksysguard6-ja \
locale-libksysguard6-ka \
locale-libksysguard6-kk \
locale-libksysguard6-km \
locale-libksysguard6-ko \
locale-libksysguard6-lt \
locale-libksysguard6-lv \
locale-libksysguard6-mai \
locale-libksysguard6-mk \
locale-libksysguard6-ml \
locale-libksysguard6-mr \
locale-libksysguard6-ms \
locale-libksysguard6-nb \
locale-libksysguard6-nds \
locale-libksysguard6-ne \
locale-libksysguard6-nl \
locale-libksysguard6-nn \
locale-libksysguard6-oc \
locale-libksysguard6-or \
locale-libksysguard6-pa \
locale-libksysguard6-pl \
locale-libksysguard6-pt \
locale-libksysguard6-pt-BR \
locale-libksysguard6-ro \
locale-libksysguard6-ru \
locale-libksysguard6-si \
locale-libksysguard6-sk \
locale-libksysguard6-sl \
locale-libksysguard6-sq \
locale-libksysguard6-sr \
locale-libksysguard6-sr@ijekavian \
locale-libksysguard6-sr@ijekavianlatin \
locale-libksysguard6-sr@latin \
locale-libksysguard6-sv \
locale-libksysguard6-ta \
locale-libksysguard6-te \
locale-libksysguard6-th \
locale-libksysguard6-tr \
locale-libksysguard6-ug \
locale-libksysguard6-uk \
locale-libksysguard6-vi \
locale-libksysguard6-wa \
locale-libksysguard6-zh-CN \
locale-libksysguard6-zh-TW"

RDEPENDS:${PN} += "libksysguard6"

inherit rpm
