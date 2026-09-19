SUMMARY = "Translations for package libshumate"
DESCRIPTION = "Provides translations for the 'libshumate' package."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause & CC0-1.0 & CC-BY-3.0 & GFDL-1.2-only"

PV = "1.6.3"

RPM_NAME = "libshumate-lang-1.6.3-1.1.noarch.rpm"
RPM_HASH = "3f0ebfb7230c29f11f5b38cbcf03e6df1816f0cf120ef5bd7f8db63b38de4409fda97b6e69b296ff1e678453329a255ebb26b6821bb3ad266ef69fcdd963d550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libshumate-lang \
libshumate-lang-all \
locale-libshumate-be \
locale-libshumate-bg \
locale-libshumate-ca \
locale-libshumate-cs \
locale-libshumate-da \
locale-libshumate-de \
locale-libshumate-el \
locale-libshumate-en-GB \
locale-libshumate-eo \
locale-libshumate-es \
locale-libshumate-eu \
locale-libshumate-fa \
locale-libshumate-fi \
locale-libshumate-fr \
locale-libshumate-fur \
locale-libshumate-gl \
locale-libshumate-he \
locale-libshumate-hi \
locale-libshumate-hr \
locale-libshumate-hu \
locale-libshumate-ia \
locale-libshumate-id \
locale-libshumate-is \
locale-libshumate-it \
locale-libshumate-ka \
locale-libshumate-kk \
locale-libshumate-ko \
locale-libshumate-lt \
locale-libshumate-lv \
locale-libshumate-ml \
locale-libshumate-nb \
locale-libshumate-ne \
locale-libshumate-nl \
locale-libshumate-oc \
locale-libshumate-pa \
locale-libshumate-pl \
locale-libshumate-pt \
locale-libshumate-pt-BR \
locale-libshumate-ro \
locale-libshumate-ru \
locale-libshumate-sk \
locale-libshumate-sl \
locale-libshumate-sr \
locale-libshumate-sv \
locale-libshumate-tr \
locale-libshumate-ug \
locale-libshumate-uk \
locale-libshumate-zh-CN \
locale-libshumate-zh-TW"

RDEPENDS:${PN} += "libshumate"

inherit rpm
