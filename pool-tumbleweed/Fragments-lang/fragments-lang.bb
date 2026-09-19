SUMMARY = "Translations for package Fragments"
DESCRIPTION = "Provides translations for the 'Fragments' package."
LICENSE = "GPL-3.0-only"

PV = "3.0.1+git339.902a2b5"

RPM_NAME = "Fragments-lang-3.0.1+git339.902a2b5-2.4.noarch.rpm"
RPM_HASH = "bbfab77eac7bc96bb490ffef6471bd397363ce826004f5158af292cd2d313f3ac14a3c69671ad989c0e9f59a7c9831e8d46c0bf0ee912e8797c852dba9f198ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Fragments-lang \
Fragments-lang-all \
locale-Fragments-be \
locale-Fragments-bg \
locale-Fragments-ca \
locale-Fragments-cs \
locale-Fragments-da \
locale-Fragments-de \
locale-Fragments-el \
locale-Fragments-en-GB \
locale-Fragments-eo \
locale-Fragments-es \
locale-Fragments-eu \
locale-Fragments-fa \
locale-Fragments-fi \
locale-Fragments-fr \
locale-Fragments-fur \
locale-Fragments-gl \
locale-Fragments-he \
locale-Fragments-hi \
locale-Fragments-hr \
locale-Fragments-hu \
locale-Fragments-id \
locale-Fragments-is \
locale-Fragments-it \
locale-Fragments-ja \
locale-Fragments-ka \
locale-Fragments-ko \
locale-Fragments-nb \
locale-Fragments-nl \
locale-Fragments-oc \
locale-Fragments-pl \
locale-Fragments-pt \
locale-Fragments-pt-BR \
locale-Fragments-ro \
locale-Fragments-ru \
locale-Fragments-sk \
locale-Fragments-sl \
locale-Fragments-sr \
locale-Fragments-sv \
locale-Fragments-tr \
locale-Fragments-uk \
locale-Fragments-vi \
locale-Fragments-zh-CN \
locale-Fragments-zh-TW"

RDEPENDS:${PN} += "Fragments"

inherit rpm
