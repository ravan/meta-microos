SUMMARY = "Translations for package deadbeef"
DESCRIPTION = "Provides translations for the 'deadbeef' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & Zlib & LGPL-2.1-or-later"

PV = "1.10.2"

RPM_NAME = "deadbeef-lang-1.10.2-3.3.noarch.rpm"
RPM_HASH = "295ee6ff91cb3cef6b9af6b455e6f787c030cfcce7cb6fe66794df9bb31cee0788588ab1f872cec0beb776c22a465d8360e597ce43202f57ad15386ae1bf0b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deadbeef-lang \
deadbeef-lang-all \
locale-deadbeef-be \
locale-deadbeef-bg \
locale-deadbeef-bn \
locale-deadbeef-ca \
locale-deadbeef-cs \
locale-deadbeef-da \
locale-deadbeef-de \
locale-deadbeef-el \
locale-deadbeef-en-GB \
locale-deadbeef-es \
locale-deadbeef-et \
locale-deadbeef-eu \
locale-deadbeef-fa \
locale-deadbeef-fi \
locale-deadbeef-fr \
locale-deadbeef-gl \
locale-deadbeef-he \
locale-deadbeef-hr \
locale-deadbeef-hu \
locale-deadbeef-id \
locale-deadbeef-it \
locale-deadbeef-ja \
locale-deadbeef-kk \
locale-deadbeef-km \
locale-deadbeef-ko \
locale-deadbeef-lt \
locale-deadbeef-lv \
locale-deadbeef-nb \
locale-deadbeef-nl \
locale-deadbeef-pl \
locale-deadbeef-pt \
locale-deadbeef-pt-BR \
locale-deadbeef-ro \
locale-deadbeef-sk \
locale-deadbeef-sl \
locale-deadbeef-sr \
locale-deadbeef-sr@latin \
locale-deadbeef-sv \
locale-deadbeef-te \
locale-deadbeef-tr \
locale-deadbeef-ug \
locale-deadbeef-uk \
locale-deadbeef-vi \
locale-deadbeef-zh-CN \
locale-deadbeef-zh-TW"

RDEPENDS:${PN} += "deadbeef"

inherit rpm
