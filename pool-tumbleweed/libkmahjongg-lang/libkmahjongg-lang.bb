SUMMARY = "Translations for package libkmahjongg"
DESCRIPTION = "Provides translations for the 'libkmahjongg' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkmahjongg-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "709c38830daa014edaeb48848a5835c62bcc7305cea0483244796a4bcc48ff980cb854779e3d12348199f323ae9f3720a5bf6f411467f35fde8f44254d53c8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkmahjongg-lang \
libkmahjongg-lang-all \
locale-libkmahjongg-ar \
locale-libkmahjongg-ast \
locale-libkmahjongg-be \
locale-libkmahjongg-bs \
locale-libkmahjongg-ca \
locale-libkmahjongg-ca@valencia \
locale-libkmahjongg-cs \
locale-libkmahjongg-da \
locale-libkmahjongg-de \
locale-libkmahjongg-el \
locale-libkmahjongg-en-GB \
locale-libkmahjongg-eo \
locale-libkmahjongg-es \
locale-libkmahjongg-et \
locale-libkmahjongg-eu \
locale-libkmahjongg-fi \
locale-libkmahjongg-fr \
locale-libkmahjongg-ga \
locale-libkmahjongg-gl \
locale-libkmahjongg-gu \
locale-libkmahjongg-he \
locale-libkmahjongg-hi \
locale-libkmahjongg-hr \
locale-libkmahjongg-hu \
locale-libkmahjongg-ia \
locale-libkmahjongg-id \
locale-libkmahjongg-is \
locale-libkmahjongg-it \
locale-libkmahjongg-ja \
locale-libkmahjongg-ka \
locale-libkmahjongg-kk \
locale-libkmahjongg-km \
locale-libkmahjongg-ko \
locale-libkmahjongg-lt \
locale-libkmahjongg-lv \
locale-libkmahjongg-mai \
locale-libkmahjongg-ml \
locale-libkmahjongg-mr \
locale-libkmahjongg-nb \
locale-libkmahjongg-nds \
locale-libkmahjongg-nl \
locale-libkmahjongg-nn \
locale-libkmahjongg-oc \
locale-libkmahjongg-pl \
locale-libkmahjongg-pt \
locale-libkmahjongg-pt-BR \
locale-libkmahjongg-ro \
locale-libkmahjongg-ru \
locale-libkmahjongg-sk \
locale-libkmahjongg-sl \
locale-libkmahjongg-sq \
locale-libkmahjongg-sr \
locale-libkmahjongg-sr@ijekavian \
locale-libkmahjongg-sr@ijekavianlatin \
locale-libkmahjongg-sr@latin \
locale-libkmahjongg-sv \
locale-libkmahjongg-th \
locale-libkmahjongg-tr \
locale-libkmahjongg-ug \
locale-libkmahjongg-uk \
locale-libkmahjongg-wa \
locale-libkmahjongg-zh-CN \
locale-libkmahjongg-zh-TW"

RDEPENDS:${PN} += "libkmahjongg"

inherit rpm
