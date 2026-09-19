SUMMARY = "Translations for package kolf"
DESCRIPTION = "Provides translations for the 'kolf' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kolf-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "41a017e7dfc17cc2ed8e3debd9529afb381e89ddbfac43320c0c55c9943e74ff3bb14aa68759c5f2d68d7a31d42329fa848a7c8987e0ff09f07d3f0894c18db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kolf-lang \
kolf-lang-all \
locale-kolf-af \
locale-kolf-ar \
locale-kolf-ast \
locale-kolf-be \
locale-kolf-br \
locale-kolf-bs \
locale-kolf-ca \
locale-kolf-ca@valencia \
locale-kolf-cs \
locale-kolf-cy \
locale-kolf-da \
locale-kolf-de \
locale-kolf-el \
locale-kolf-en-GB \
locale-kolf-eo \
locale-kolf-es \
locale-kolf-et \
locale-kolf-eu \
locale-kolf-fa \
locale-kolf-fi \
locale-kolf-fr \
locale-kolf-ga \
locale-kolf-gl \
locale-kolf-he \
locale-kolf-hi \
locale-kolf-hr \
locale-kolf-hu \
locale-kolf-ia \
locale-kolf-is \
locale-kolf-it \
locale-kolf-ja \
locale-kolf-ka \
locale-kolf-kk \
locale-kolf-km \
locale-kolf-ko \
locale-kolf-lt \
locale-kolf-lv \
locale-kolf-mai \
locale-kolf-mk \
locale-kolf-ml \
locale-kolf-mr \
locale-kolf-ms \
locale-kolf-nb \
locale-kolf-nds \
locale-kolf-ne \
locale-kolf-nl \
locale-kolf-nn \
locale-kolf-oc \
locale-kolf-pa \
locale-kolf-pl \
locale-kolf-pt \
locale-kolf-pt-BR \
locale-kolf-ro \
locale-kolf-ru \
locale-kolf-sk \
locale-kolf-sl \
locale-kolf-sq \
locale-kolf-sr \
locale-kolf-sr@ijekavian \
locale-kolf-sr@ijekavianlatin \
locale-kolf-sr@latin \
locale-kolf-sv \
locale-kolf-ta \
locale-kolf-tr \
locale-kolf-ug \
locale-kolf-uk \
locale-kolf-zh-CN \
locale-kolf-zh-TW"

RDEPENDS:${PN} += "kolf"

inherit rpm
