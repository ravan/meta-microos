SUMMARY = "Translations for package libgsf"
DESCRIPTION = "Provides translations for the 'libgsf' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.58"

RPM_NAME = "libgsf-lang-1.14.58-1.3.noarch.rpm"
RPM_HASH = "7f2d77a7c5b109ff6443b5d40defdbfd0c32518a5452afcacd1a01312c4b21a19304725fbced3ecd1f120312f80ddc3318068593d4a4c35894ef60c558081201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgsf-lang \
libgsf-lang-all \
locale-libgsf-as \
locale-libgsf-bs \
locale-libgsf-ca \
locale-libgsf-ca@valencia \
locale-libgsf-cs \
locale-libgsf-da \
locale-libgsf-de \
locale-libgsf-el \
locale-libgsf-en-GB \
locale-libgsf-eo \
locale-libgsf-es \
locale-libgsf-eu \
locale-libgsf-fi \
locale-libgsf-fr \
locale-libgsf-gl \
locale-libgsf-he \
locale-libgsf-hi \
locale-libgsf-hr \
locale-libgsf-hu \
locale-libgsf-id \
locale-libgsf-it \
locale-libgsf-ja \
locale-libgsf-ka \
locale-libgsf-kk \
locale-libgsf-ko \
locale-libgsf-lt \
locale-libgsf-lv \
locale-libgsf-ml \
locale-libgsf-nb \
locale-libgsf-nl \
locale-libgsf-nn \
locale-libgsf-oc \
locale-libgsf-pa \
locale-libgsf-pl \
locale-libgsf-pt \
locale-libgsf-pt-BR \
locale-libgsf-ro \
locale-libgsf-ru \
locale-libgsf-sk \
locale-libgsf-sl \
locale-libgsf-sr \
locale-libgsf-sr@latin \
locale-libgsf-sv \
locale-libgsf-ta \
locale-libgsf-th \
locale-libgsf-tr \
locale-libgsf-uk \
locale-libgsf-zh-CN \
locale-libgsf-zh-HK \
locale-libgsf-zh-TW"

RDEPENDS:${PN} += "libgsf"

inherit rpm
