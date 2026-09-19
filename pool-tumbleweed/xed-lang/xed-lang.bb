SUMMARY = "Translations for package xed"
DESCRIPTION = "Provides translations for the 'xed' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.9"

RPM_NAME = "xed-lang-3.8.9-1.3.noarch.rpm"
RPM_HASH = "e01417855f3e54cd7c9ba244d0147e9b16e5afc6e8d9eebf248d5f91206892abb6525f1bfba9e8172133c8df353576a17164236d057a5d35c97ead091f3046c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xed-af \
locale-xed-ar \
locale-xed-as \
locale-xed-ast \
locale-xed-az \
locale-xed-be \
locale-xed-be@latin \
locale-xed-bg \
locale-xed-bn \
locale-xed-bn-IN \
locale-xed-br \
locale-xed-bs \
locale-xed-ca \
locale-xed-ca@valencia \
locale-xed-cs \
locale-xed-cy \
locale-xed-da \
locale-xed-de \
locale-xed-dz \
locale-xed-el \
locale-xed-en-AU \
locale-xed-en-CA \
locale-xed-en-GB \
locale-xed-en@shaw \
locale-xed-eo \
locale-xed-es \
locale-xed-et \
locale-xed-eu \
locale-xed-fa \
locale-xed-fi \
locale-xed-fr \
locale-xed-fr-CA \
locale-xed-ga \
locale-xed-gl \
locale-xed-gu \
locale-xed-he \
locale-xed-hi \
locale-xed-hr \
locale-xed-hu \
locale-xed-ia \
locale-xed-id \
locale-xed-is \
locale-xed-it \
locale-xed-ja \
locale-xed-ka \
locale-xed-kk \
locale-xed-kn \
locale-xed-ko \
locale-xed-lt \
locale-xed-lv \
locale-xed-mai \
locale-xed-mk \
locale-xed-ml \
locale-xed-mr \
locale-xed-ms \
locale-xed-nb \
locale-xed-nds \
locale-xed-ne \
locale-xed-nl \
locale-xed-nn \
locale-xed-oc \
locale-xed-or \
locale-xed-pa \
locale-xed-pl \
locale-xed-pt \
locale-xed-pt-BR \
locale-xed-ro \
locale-xed-ru \
locale-xed-si \
locale-xed-sk \
locale-xed-sl \
locale-xed-sq \
locale-xed-sr \
locale-xed-sr@latin \
locale-xed-sv \
locale-xed-ta \
locale-xed-te \
locale-xed-th \
locale-xed-tr \
locale-xed-uk \
locale-xed-vi \
locale-xed-wa \
locale-xed-zh-CN \
locale-xed-zh-HK \
locale-xed-zh-TW \
xed-lang \
xed-lang-all"

RDEPENDS:${PN} += "xed"

inherit rpm
