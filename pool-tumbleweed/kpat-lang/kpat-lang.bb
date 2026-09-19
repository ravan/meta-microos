SUMMARY = "Translations for package kpat"
DESCRIPTION = "Provides translations for the 'kpat' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kpat-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "2fbc8771ecf39c2f2236edff088477d2024ba96fe87c32df099bc0895cbb0c1782d690f3b3d2abb02db864f7c98f8e4863159bb848bd6defa40a5eec7f21e00f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpat-lang \
kpat-lang-all \
locale-kpat-af \
locale-kpat-ar \
locale-kpat-ast \
locale-kpat-be \
locale-kpat-bg \
locale-kpat-br \
locale-kpat-bs \
locale-kpat-ca \
locale-kpat-ca@valencia \
locale-kpat-cs \
locale-kpat-cy \
locale-kpat-da \
locale-kpat-de \
locale-kpat-el \
locale-kpat-en-GB \
locale-kpat-eo \
locale-kpat-es \
locale-kpat-et \
locale-kpat-eu \
locale-kpat-fa \
locale-kpat-fi \
locale-kpat-fr \
locale-kpat-ga \
locale-kpat-gl \
locale-kpat-he \
locale-kpat-hi \
locale-kpat-hr \
locale-kpat-hu \
locale-kpat-ia \
locale-kpat-id \
locale-kpat-is \
locale-kpat-it \
locale-kpat-ja \
locale-kpat-ka \
locale-kpat-kk \
locale-kpat-km \
locale-kpat-ko \
locale-kpat-lt \
locale-kpat-lv \
locale-kpat-mai \
locale-kpat-mk \
locale-kpat-ml \
locale-kpat-mr \
locale-kpat-ms \
locale-kpat-nb \
locale-kpat-nds \
locale-kpat-ne \
locale-kpat-nl \
locale-kpat-nn \
locale-kpat-oc \
locale-kpat-pa \
locale-kpat-pl \
locale-kpat-pt \
locale-kpat-pt-BR \
locale-kpat-ro \
locale-kpat-ru \
locale-kpat-sk \
locale-kpat-sl \
locale-kpat-sq \
locale-kpat-sr \
locale-kpat-sr@ijekavian \
locale-kpat-sr@ijekavianlatin \
locale-kpat-sr@latin \
locale-kpat-sv \
locale-kpat-ta \
locale-kpat-th \
locale-kpat-tr \
locale-kpat-ug \
locale-kpat-uk \
locale-kpat-wa \
locale-kpat-zh-CN \
locale-kpat-zh-TW"

RDEPENDS:${PN} += "kpat"

inherit rpm
