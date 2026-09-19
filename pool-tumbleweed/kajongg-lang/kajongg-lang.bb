SUMMARY = "Translations for package kajongg"
DESCRIPTION = "Provides translations for the 'kajongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kajongg-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "3da1b44bcfafec628f48885fcce57629e12acc78b0751789a686d7a4288a702d777d9d413bcc3d080be5599dd49c6088b0ee07d412af473d3ad30dcf3cebc207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kajongg-lang \
kajongg-lang-all \
locale-kajongg-ar \
locale-kajongg-ast \
locale-kajongg-bs \
locale-kajongg-ca \
locale-kajongg-ca@valencia \
locale-kajongg-cs \
locale-kajongg-da \
locale-kajongg-de \
locale-kajongg-el \
locale-kajongg-en-GB \
locale-kajongg-eo \
locale-kajongg-es \
locale-kajongg-et \
locale-kajongg-eu \
locale-kajongg-fi \
locale-kajongg-fr \
locale-kajongg-ga \
locale-kajongg-gl \
locale-kajongg-he \
locale-kajongg-hi \
locale-kajongg-hu \
locale-kajongg-ia \
locale-kajongg-is \
locale-kajongg-it \
locale-kajongg-ja \
locale-kajongg-ka \
locale-kajongg-kk \
locale-kajongg-km \
locale-kajongg-ko \
locale-kajongg-lt \
locale-kajongg-mai \
locale-kajongg-ml \
locale-kajongg-mr \
locale-kajongg-nb \
locale-kajongg-nds \
locale-kajongg-nl \
locale-kajongg-nn \
locale-kajongg-pl \
locale-kajongg-pt \
locale-kajongg-pt-BR \
locale-kajongg-ro \
locale-kajongg-ru \
locale-kajongg-sk \
locale-kajongg-sl \
locale-kajongg-sr \
locale-kajongg-sr@ijekavian \
locale-kajongg-sr@ijekavianlatin \
locale-kajongg-sr@latin \
locale-kajongg-sv \
locale-kajongg-tr \
locale-kajongg-ug \
locale-kajongg-uk \
locale-kajongg-zh-CN \
locale-kajongg-zh-TW"

RDEPENDS:${PN} += "kajongg"

inherit rpm
