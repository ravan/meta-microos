SUMMARY = "Translations for package krfb"
DESCRIPTION = "Provides translations for the 'krfb' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "krfb-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "ee6f2e5af2e5f67215b814efbc9eb9ee05c72010dc4352ec98ddd94bb1f7890f785d4e52f73803695b74df7db06a7a54faccc489240aa5c102150bd4cc51c5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krfb-lang \
krfb-lang-all \
locale-krfb-af \
locale-krfb-ar \
locale-krfb-ast \
locale-krfb-be \
locale-krfb-bg \
locale-krfb-br \
locale-krfb-bs \
locale-krfb-ca \
locale-krfb-ca@valencia \
locale-krfb-cs \
locale-krfb-cy \
locale-krfb-da \
locale-krfb-de \
locale-krfb-el \
locale-krfb-en-GB \
locale-krfb-eo \
locale-krfb-es \
locale-krfb-et \
locale-krfb-eu \
locale-krfb-fa \
locale-krfb-fi \
locale-krfb-fr \
locale-krfb-ga \
locale-krfb-gl \
locale-krfb-he \
locale-krfb-hi \
locale-krfb-hr \
locale-krfb-hu \
locale-krfb-ia \
locale-krfb-id \
locale-krfb-is \
locale-krfb-it \
locale-krfb-ja \
locale-krfb-ka \
locale-krfb-kk \
locale-krfb-km \
locale-krfb-ko \
locale-krfb-lt \
locale-krfb-lv \
locale-krfb-mai \
locale-krfb-mk \
locale-krfb-ml \
locale-krfb-mr \
locale-krfb-ms \
locale-krfb-nb \
locale-krfb-nds \
locale-krfb-ne \
locale-krfb-nl \
locale-krfb-nn \
locale-krfb-oc \
locale-krfb-pa \
locale-krfb-pl \
locale-krfb-pt \
locale-krfb-pt-BR \
locale-krfb-ro \
locale-krfb-ru \
locale-krfb-sk \
locale-krfb-sl \
locale-krfb-sq \
locale-krfb-sr \
locale-krfb-sr@ijekavian \
locale-krfb-sr@ijekavianlatin \
locale-krfb-sr@latin \
locale-krfb-sv \
locale-krfb-ta \
locale-krfb-th \
locale-krfb-tr \
locale-krfb-ug \
locale-krfb-uk \
locale-krfb-vi \
locale-krfb-zh-CN \
locale-krfb-zh-TW"

RDEPENDS:${PN} += "krfb"

inherit rpm
