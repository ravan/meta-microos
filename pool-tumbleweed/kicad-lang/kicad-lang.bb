SUMMARY = "Translations for package kicad"
DESCRIPTION = "Provides translations for the 'kicad' package."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-lang-10.0.6-1.2.noarch.rpm"
RPM_HASH = "e038049a38dc89c11c8e9ad8c169a7462800704ae440f20d9aceb5929948efd1769a204cdf9703396a4c59052f2047c3fa6def6d50ab1bffc680eb9f452c6bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-lang \
kicad-lang-all \
locale-kicad-ar \
locale-kicad-bg \
locale-kicad-ca \
locale-kicad-cs \
locale-kicad-da \
locale-kicad-de \
locale-kicad-el \
locale-kicad-en \
locale-kicad-es \
locale-kicad-es-MX \
locale-kicad-et \
locale-kicad-fa \
locale-kicad-fi \
locale-kicad-fr \
locale-kicad-he \
locale-kicad-hi \
locale-kicad-hr \
locale-kicad-hu \
locale-kicad-id \
locale-kicad-it \
locale-kicad-ja \
locale-kicad-ka \
locale-kicad-ko \
locale-kicad-lt \
locale-kicad-lv \
locale-kicad-nl \
locale-kicad-pl \
locale-kicad-pt \
locale-kicad-pt-BR \
locale-kicad-ro \
locale-kicad-ru \
locale-kicad-sk \
locale-kicad-sl \
locale-kicad-sr \
locale-kicad-sv \
locale-kicad-ta \
locale-kicad-te \
locale-kicad-th \
locale-kicad-tr \
locale-kicad-uk \
locale-kicad-vi \
locale-kicad-zh-CN \
locale-kicad-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
