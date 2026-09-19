SUMMARY = "Translations for package geany"
DESCRIPTION = "Provides translations for the 'geany' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "geany-lang-2.1-1.7.noarch.rpm"
RPM_HASH = "caacc944397b1389de1334ccc0700b0018ad9ed6de4e4621acc57f2bfbf4812bdfc656cb9ae526baac3b61da1587b324a9b79f1ff93d15607637ad9dc6384624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geany-lang \
geany-lang-all \
locale-geany-ar \
locale-geany-ast \
locale-geany-be \
locale-geany-bg \
locale-geany-ca \
locale-geany-cs \
locale-geany-da \
locale-geany-de \
locale-geany-el \
locale-geany-en-GB \
locale-geany-es \
locale-geany-et \
locale-geany-eu \
locale-geany-fa \
locale-geany-fi \
locale-geany-fr \
locale-geany-gl \
locale-geany-he \
locale-geany-hi \
locale-geany-hu \
locale-geany-id \
locale-geany-it \
locale-geany-ja \
locale-geany-kk \
locale-geany-ko \
locale-geany-lt \
locale-geany-lv \
locale-geany-nl \
locale-geany-nn \
locale-geany-pl \
locale-geany-pt \
locale-geany-pt-BR \
locale-geany-ro \
locale-geany-ru \
locale-geany-sk \
locale-geany-sl \
locale-geany-sr \
locale-geany-sv \
locale-geany-tr \
locale-geany-uk \
locale-geany-vi \
locale-geany-zh-CN \
locale-geany-zh-TW"

RDEPENDS:${PN} += "geany"

inherit rpm
