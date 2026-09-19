SUMMARY = "Translations for package kio_perldoc"
DESCRIPTION = "Provides translations for the 'kio_perldoc' package."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kio_perldoc-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "b317fa12ad2d81554dec8449f034484462ac8dc79a86f23165c951e0136a0207dd7819f9dbc5e55c004943a6654c538a7e1b75dffc3a2d1261705e77a36c74fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-perldoc-lang \
kio-perldoc-lang-all \
locale-kio-perldoc-ar \
locale-kio-perldoc-bs \
locale-kio-perldoc-ca \
locale-kio-perldoc-ca@valencia \
locale-kio-perldoc-cs \
locale-kio-perldoc-da \
locale-kio-perldoc-de \
locale-kio-perldoc-el \
locale-kio-perldoc-en-GB \
locale-kio-perldoc-eo \
locale-kio-perldoc-es \
locale-kio-perldoc-et \
locale-kio-perldoc-eu \
locale-kio-perldoc-fi \
locale-kio-perldoc-fr \
locale-kio-perldoc-ga \
locale-kio-perldoc-gl \
locale-kio-perldoc-he \
locale-kio-perldoc-hi \
locale-kio-perldoc-hu \
locale-kio-perldoc-ia \
locale-kio-perldoc-it \
locale-kio-perldoc-ja \
locale-kio-perldoc-ka \
locale-kio-perldoc-kk \
locale-kio-perldoc-ko \
locale-kio-perldoc-lt \
locale-kio-perldoc-lv \
locale-kio-perldoc-mr \
locale-kio-perldoc-nb \
locale-kio-perldoc-nds \
locale-kio-perldoc-nl \
locale-kio-perldoc-nn \
locale-kio-perldoc-pa \
locale-kio-perldoc-pl \
locale-kio-perldoc-pt \
locale-kio-perldoc-pt-BR \
locale-kio-perldoc-ro \
locale-kio-perldoc-ru \
locale-kio-perldoc-sk \
locale-kio-perldoc-sl \
locale-kio-perldoc-sq \
locale-kio-perldoc-sv \
locale-kio-perldoc-ta \
locale-kio-perldoc-tr \
locale-kio-perldoc-ug \
locale-kio-perldoc-uk \
locale-kio-perldoc-zh-CN \
locale-kio-perldoc-zh-TW"

RDEPENDS:${PN} += "kio-perldoc"

inherit rpm
