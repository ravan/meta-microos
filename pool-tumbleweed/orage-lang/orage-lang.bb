SUMMARY = "Translations for package orage"
DESCRIPTION = "Provides translations for the 'orage' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.3"

RPM_NAME = "orage-lang-4.20.3-1.3.noarch.rpm"
RPM_HASH = "b8ac2c7d102a1c5ad20b6abafcb6982a19d77c389e256e64cdb7894978f989670f4e239527084c18e72b3667b2372022c0d8c056e136a360ca66240503f8e5c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-orage-ar \
locale-orage-ast \
locale-orage-be \
locale-orage-bg \
locale-orage-ca \
locale-orage-cs \
locale-orage-da \
locale-orage-de \
locale-orage-el \
locale-orage-en-AU \
locale-orage-en-GB \
locale-orage-eo \
locale-orage-es \
locale-orage-et \
locale-orage-eu \
locale-orage-fi \
locale-orage-fr \
locale-orage-gl \
locale-orage-he \
locale-orage-hr \
locale-orage-hu \
locale-orage-id \
locale-orage-is \
locale-orage-it \
locale-orage-ja \
locale-orage-kk \
locale-orage-ko \
locale-orage-lt \
locale-orage-lv \
locale-orage-ms \
locale-orage-nb \
locale-orage-nl \
locale-orage-nn \
locale-orage-oc \
locale-orage-pa \
locale-orage-pl \
locale-orage-pt \
locale-orage-pt-BR \
locale-orage-ro \
locale-orage-ru \
locale-orage-si \
locale-orage-sk \
locale-orage-sl \
locale-orage-sq \
locale-orage-sr \
locale-orage-sv \
locale-orage-th \
locale-orage-tr \
locale-orage-ug \
locale-orage-uk \
locale-orage-vi \
locale-orage-zh-CN \
locale-orage-zh-TW \
orage-lang \
orage-lang-all"

RDEPENDS:${PN} += "orage"

inherit rpm
