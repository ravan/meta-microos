SUMMARY = "Translations for package subtitlecomposer"
DESCRIPTION = "Provides translations for the 'subtitlecomposer' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.2"

RPM_NAME = "subtitlecomposer-lang-0.8.2-2.14.noarch.rpm"
RPM_HASH = "4d59a6307f9257428fd824b0189947e5b61bd8a174bd523481f262a4ad75f8121b5bf46ea3e002776a601451f7e0206757d2347f87a09a2cde9de4f4e94e7ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-subtitlecomposer-ar \
locale-subtitlecomposer-bg \
locale-subtitlecomposer-ca \
locale-subtitlecomposer-ca@valencia \
locale-subtitlecomposer-cs \
locale-subtitlecomposer-de \
locale-subtitlecomposer-el \
locale-subtitlecomposer-en-GB \
locale-subtitlecomposer-eo \
locale-subtitlecomposer-es \
locale-subtitlecomposer-et \
locale-subtitlecomposer-eu \
locale-subtitlecomposer-fi \
locale-subtitlecomposer-fr \
locale-subtitlecomposer-gl \
locale-subtitlecomposer-hr \
locale-subtitlecomposer-hu \
locale-subtitlecomposer-id \
locale-subtitlecomposer-it \
locale-subtitlecomposer-ja \
locale-subtitlecomposer-ka \
locale-subtitlecomposer-lt \
locale-subtitlecomposer-nl \
locale-subtitlecomposer-pl \
locale-subtitlecomposer-pt \
locale-subtitlecomposer-pt-BR \
locale-subtitlecomposer-ru \
locale-subtitlecomposer-sk \
locale-subtitlecomposer-sl \
locale-subtitlecomposer-sr \
locale-subtitlecomposer-sr@latin \
locale-subtitlecomposer-sv \
locale-subtitlecomposer-tr \
locale-subtitlecomposer-uk \
locale-subtitlecomposer-zh-CN \
locale-subtitlecomposer-zh-TW \
subtitlecomposer-lang \
subtitlecomposer-lang-all"

RDEPENDS:${PN} += "subtitlecomposer"

inherit rpm
