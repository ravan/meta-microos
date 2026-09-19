SUMMARY = "Translations for package homebank"
DESCRIPTION = "Provides translations for the 'homebank' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.10.2"

RPM_NAME = "homebank-lang-5.10.2-1.2.noarch.rpm"
RPM_HASH = "e9d14c0a5e089967b2d610fcb9d0f86b18f1fe5c3f153ae36623c4b8d405e1b4f6d0a2416564bffcccdc2a2a0b275497e396cc15056fab1c3c2584c67a1f7ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "homebank-lang \
homebank-lang-all \
locale-homebank-af \
locale-homebank-ar \
locale-homebank-be \
locale-homebank-bg \
locale-homebank-bn \
locale-homebank-br \
locale-homebank-ca \
locale-homebank-cs \
locale-homebank-cy \
locale-homebank-da \
locale-homebank-de \
locale-homebank-el \
locale-homebank-en-AU \
locale-homebank-en-CA \
locale-homebank-en-GB \
locale-homebank-es \
locale-homebank-et \
locale-homebank-eu \
locale-homebank-fa \
locale-homebank-fi \
locale-homebank-fr \
locale-homebank-fr-CA \
locale-homebank-gl \
locale-homebank-he \
locale-homebank-hi \
locale-homebank-hr \
locale-homebank-hu \
locale-homebank-id \
locale-homebank-is \
locale-homebank-it \
locale-homebank-ja \
locale-homebank-ko \
locale-homebank-lt \
locale-homebank-lv \
locale-homebank-ms \
locale-homebank-nb \
locale-homebank-nds \
locale-homebank-nl \
locale-homebank-oc \
locale-homebank-pl \
locale-homebank-pt \
locale-homebank-pt-BR \
locale-homebank-pt-PT \
locale-homebank-ro \
locale-homebank-ru \
locale-homebank-si \
locale-homebank-sl \
locale-homebank-sq \
locale-homebank-sr \
locale-homebank-sv \
locale-homebank-ta \
locale-homebank-tr \
locale-homebank-uk \
locale-homebank-vi \
locale-homebank-zh-CN \
locale-homebank-zh-TW"

RDEPENDS:${PN} += "homebank"

inherit rpm
