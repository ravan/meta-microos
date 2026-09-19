SUMMARY = "Translations for package snapshot"
DESCRIPTION = "Provides translations for the 'snapshot' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "snapshot-lang-50.0-1.4.noarch.rpm"
RPM_HASH = "3d0903a2925b0f7f67428dec2a20f0fbebb3af8312cc263950b6823d90147b0fa37db3447a6110cd555c8d0bc8571c7272d5beee9f0a5dcfb08ac53a580eea8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-snapshot-ar \
locale-snapshot-be \
locale-snapshot-bg \
locale-snapshot-ca \
locale-snapshot-cs \
locale-snapshot-da \
locale-snapshot-de \
locale-snapshot-el \
locale-snapshot-en-GB \
locale-snapshot-eo \
locale-snapshot-es \
locale-snapshot-eu \
locale-snapshot-fa \
locale-snapshot-fi \
locale-snapshot-fr \
locale-snapshot-fur \
locale-snapshot-gl \
locale-snapshot-he \
locale-snapshot-hi \
locale-snapshot-hu \
locale-snapshot-ia \
locale-snapshot-id \
locale-snapshot-it \
locale-snapshot-ja \
locale-snapshot-ka \
locale-snapshot-kk \
locale-snapshot-ko \
locale-snapshot-lt \
locale-snapshot-lv \
locale-snapshot-nb \
locale-snapshot-ne \
locale-snapshot-nl \
locale-snapshot-oc \
locale-snapshot-pa \
locale-snapshot-pl \
locale-snapshot-pt \
locale-snapshot-pt-BR \
locale-snapshot-ro \
locale-snapshot-ru \
locale-snapshot-sk \
locale-snapshot-sl \
locale-snapshot-sr \
locale-snapshot-sr@latin \
locale-snapshot-sv \
locale-snapshot-th \
locale-snapshot-tr \
locale-snapshot-ug \
locale-snapshot-uk \
locale-snapshot-vi \
locale-snapshot-zh-CN \
locale-snapshot-zh-TW \
snapshot-lang \
snapshot-lang-all"

RDEPENDS:${PN} += "snapshot"

inherit rpm
