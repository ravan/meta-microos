SUMMARY = "Translations for package juk"
DESCRIPTION = "Provides translations for the 'juk' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "juk-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "52bdb47e9d0331ae3be297c28f39911d1874c96efb697d5481bda78ab37398cd2d5551ac088be46400dcd02f83c0a0c2559f58d1c1a0e5f0f27c8adf6751cf4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "juk-lang \
juk-lang-all \
locale-juk-ar \
locale-juk-ast \
locale-juk-be \
locale-juk-bg \
locale-juk-bn \
locale-juk-br \
locale-juk-bs \
locale-juk-ca \
locale-juk-ca@valencia \
locale-juk-cs \
locale-juk-cy \
locale-juk-da \
locale-juk-de \
locale-juk-el \
locale-juk-en-GB \
locale-juk-eo \
locale-juk-es \
locale-juk-et \
locale-juk-eu \
locale-juk-fa \
locale-juk-fi \
locale-juk-fr \
locale-juk-ga \
locale-juk-gl \
locale-juk-he \
locale-juk-hi \
locale-juk-hr \
locale-juk-hu \
locale-juk-ia \
locale-juk-id \
locale-juk-is \
locale-juk-it \
locale-juk-ja \
locale-juk-ka \
locale-juk-kk \
locale-juk-km \
locale-juk-ko \
locale-juk-lt \
locale-juk-lv \
locale-juk-mk \
locale-juk-mr \
locale-juk-ms \
locale-juk-nb \
locale-juk-nds \
locale-juk-ne \
locale-juk-nl \
locale-juk-nn \
locale-juk-oc \
locale-juk-pa \
locale-juk-pl \
locale-juk-pt \
locale-juk-pt-BR \
locale-juk-ro \
locale-juk-ru \
locale-juk-sk \
locale-juk-sl \
locale-juk-sq \
locale-juk-sr \
locale-juk-sr@ijekavian \
locale-juk-sr@ijekavianlatin \
locale-juk-sr@latin \
locale-juk-sv \
locale-juk-ta \
locale-juk-th \
locale-juk-tr \
locale-juk-ug \
locale-juk-uk \
locale-juk-zh-CN \
locale-juk-zh-TW"

RDEPENDS:${PN} += "juk"

inherit rpm
