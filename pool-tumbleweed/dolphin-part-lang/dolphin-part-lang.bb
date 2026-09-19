SUMMARY = "Translations for package dolphin"
DESCRIPTION = "Provides translations for the dolphin package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "dolphin-part-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "203399032350c7d51bef9bb1917abd111fa0f291bb0ae6764e8102c1d978e17702cb4329c4a75a26aca4b439e2aa5411f69ce1db60c409ba82cb198545c60974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-lang \
dolphin-part-lang \
dolphin-part-lang-all \
locale-dolphin-part-ar \
locale-dolphin-part-ast \
locale-dolphin-part-az \
locale-dolphin-part-be \
locale-dolphin-part-be@latin \
locale-dolphin-part-bg \
locale-dolphin-part-bn \
locale-dolphin-part-bn-IN \
locale-dolphin-part-bs \
locale-dolphin-part-ca \
locale-dolphin-part-ca@valencia \
locale-dolphin-part-cs \
locale-dolphin-part-da \
locale-dolphin-part-de \
locale-dolphin-part-el \
locale-dolphin-part-en-GB \
locale-dolphin-part-eo \
locale-dolphin-part-es \
locale-dolphin-part-et \
locale-dolphin-part-eu \
locale-dolphin-part-fa \
locale-dolphin-part-fi \
locale-dolphin-part-fr \
locale-dolphin-part-ga \
locale-dolphin-part-gl \
locale-dolphin-part-gu \
locale-dolphin-part-he \
locale-dolphin-part-hi \
locale-dolphin-part-hr \
locale-dolphin-part-hu \
locale-dolphin-part-ia \
locale-dolphin-part-id \
locale-dolphin-part-is \
locale-dolphin-part-it \
locale-dolphin-part-ja \
locale-dolphin-part-ka \
locale-dolphin-part-kk \
locale-dolphin-part-km \
locale-dolphin-part-kn \
locale-dolphin-part-ko \
locale-dolphin-part-lt \
locale-dolphin-part-lv \
locale-dolphin-part-mai \
locale-dolphin-part-mk \
locale-dolphin-part-ml \
locale-dolphin-part-mr \
locale-dolphin-part-ms \
locale-dolphin-part-nb \
locale-dolphin-part-nds \
locale-dolphin-part-ne \
locale-dolphin-part-nl \
locale-dolphin-part-nn \
locale-dolphin-part-oc \
locale-dolphin-part-or \
locale-dolphin-part-pa \
locale-dolphin-part-pl \
locale-dolphin-part-pt \
locale-dolphin-part-pt-BR \
locale-dolphin-part-ro \
locale-dolphin-part-ru \
locale-dolphin-part-si \
locale-dolphin-part-sk \
locale-dolphin-part-sl \
locale-dolphin-part-sq \
locale-dolphin-part-sr \
locale-dolphin-part-sr@ijekavian \
locale-dolphin-part-sr@ijekavianlatin \
locale-dolphin-part-sr@latin \
locale-dolphin-part-sv \
locale-dolphin-part-ta \
locale-dolphin-part-te \
locale-dolphin-part-th \
locale-dolphin-part-tr \
locale-dolphin-part-ug \
locale-dolphin-part-uk \
locale-dolphin-part-vi \
locale-dolphin-part-wa \
locale-dolphin-part-zh-CN \
locale-dolphin-part-zh-TW"

RDEPENDS:${PN} += "dolphin-part"

inherit rpm
