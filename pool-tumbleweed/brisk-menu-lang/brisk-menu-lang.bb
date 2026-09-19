SUMMARY = "Translations for package brisk-menu"
DESCRIPTION = "Provides translations for the 'brisk-menu' package."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "0.6.2"

RPM_NAME = "brisk-menu-lang-0.6.2-2.8.noarch.rpm"
RPM_HASH = "963d37137a9d56c827f0e939f29f3e4f0a4042f99f13e4faa13e9e82853f6fcffd5f39876426244900ba8acb2305f9f5a46c5a4d526901081fe8475d6827e3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brisk-menu-lang \
brisk-menu-lang-all \
locale-brisk-menu-ar \
locale-brisk-menu-be \
locale-brisk-menu-bg \
locale-brisk-menu-bn \
locale-brisk-menu-bs \
locale-brisk-menu-ca \
locale-brisk-menu-cs \
locale-brisk-menu-de \
locale-brisk-menu-de-CH \
locale-brisk-menu-el \
locale-brisk-menu-en-GB \
locale-brisk-menu-en-US \
locale-brisk-menu-eo \
locale-brisk-menu-es \
locale-brisk-menu-es-AR \
locale-brisk-menu-es-MX \
locale-brisk-menu-eu \
locale-brisk-menu-fi \
locale-brisk-menu-fr-FR \
locale-brisk-menu-ga \
locale-brisk-menu-he \
locale-brisk-menu-hu \
locale-brisk-menu-it \
locale-brisk-menu-ja \
locale-brisk-menu-kk \
locale-brisk-menu-ko \
locale-brisk-menu-lt \
locale-brisk-menu-ms \
locale-brisk-menu-nb-NO \
locale-brisk-menu-nl-BE \
locale-brisk-menu-nn \
locale-brisk-menu-pl \
locale-brisk-menu-pt-BR \
locale-brisk-menu-pt-PT \
locale-brisk-menu-ru \
locale-brisk-menu-si \
locale-brisk-menu-sk \
locale-brisk-menu-te \
locale-brisk-menu-tr \
locale-brisk-menu-uk \
locale-brisk-menu-vi \
locale-brisk-menu-zh-CN \
locale-brisk-menu-zh-TW"

RDEPENDS:${PN} += "brisk-menu"

inherit rpm
