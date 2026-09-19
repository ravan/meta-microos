SUMMARY = "Translations for package decibels"
DESCRIPTION = "Provides translations for the 'decibels' package."
LICENSE = "GPL-3.0-or-later"

PV = "49.6.1"

RPM_NAME = "decibels-lang-49.6.1-1.2.noarch.rpm"
RPM_HASH = "584529c1be5c6816e53f1e8ae3710d266315f2814670f8dccf4ba832f1c96c06acc5a0fec8d54d3259d34e6ae7f171c9cf27b3326614b12f32972c6a7e722ffd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "decibels-lang \
decibels-lang-all \
locale-decibels-ar \
locale-decibels-be \
locale-decibels-bg \
locale-decibels-ca \
locale-decibels-cs \
locale-decibels-da \
locale-decibels-de \
locale-decibels-el \
locale-decibels-en-GB \
locale-decibels-eo \
locale-decibels-es \
locale-decibels-eu \
locale-decibels-fa \
locale-decibels-fi \
locale-decibels-fr \
locale-decibels-fur \
locale-decibels-gl \
locale-decibels-he \
locale-decibels-hi \
locale-decibels-hu \
locale-decibels-ia \
locale-decibels-id \
locale-decibels-is \
locale-decibels-it \
locale-decibels-ja \
locale-decibels-ka \
locale-decibels-kk \
locale-decibels-ko \
locale-decibels-lt \
locale-decibels-nb \
locale-decibels-ne \
locale-decibels-nl \
locale-decibels-oc \
locale-decibels-pa \
locale-decibels-pl \
locale-decibels-pt \
locale-decibels-pt-BR \
locale-decibels-ro \
locale-decibels-ru \
locale-decibels-sk \
locale-decibels-sl \
locale-decibels-sr \
locale-decibels-sr@latin \
locale-decibels-sv \
locale-decibels-th \
locale-decibels-tr \
locale-decibels-ug \
locale-decibels-uk \
locale-decibels-zh-CN \
locale-decibels-zh-TW"

RDEPENDS:${PN} += "decibels"

inherit rpm
