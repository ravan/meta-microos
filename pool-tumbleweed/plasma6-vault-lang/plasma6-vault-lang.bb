SUMMARY = "Translations for package plasma6-vault"
DESCRIPTION = "Provides translations for the 'plasma6-vault' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-vault-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "ea63a79e8ec93d9cf71a5c09494ba78b85e935d55d30efd5f70d6ff0e07a0b4b991f9e367a573cf9f256d1b11d1cbe4b5e9add013accc963a8e7e4d5c9cf8e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-vault-ar \
locale-plasma6-vault-ast \
locale-plasma6-vault-az \
locale-plasma6-vault-be \
locale-plasma6-vault-bg \
locale-plasma6-vault-ca \
locale-plasma6-vault-ca@valencia \
locale-plasma6-vault-cs \
locale-plasma6-vault-da \
locale-plasma6-vault-de \
locale-plasma6-vault-el \
locale-plasma6-vault-en-GB \
locale-plasma6-vault-eo \
locale-plasma6-vault-es \
locale-plasma6-vault-et \
locale-plasma6-vault-eu \
locale-plasma6-vault-fi \
locale-plasma6-vault-fr \
locale-plasma6-vault-ga \
locale-plasma6-vault-gl \
locale-plasma6-vault-he \
locale-plasma6-vault-hi \
locale-plasma6-vault-hu \
locale-plasma6-vault-ia \
locale-plasma6-vault-id \
locale-plasma6-vault-is \
locale-plasma6-vault-it \
locale-plasma6-vault-ja \
locale-plasma6-vault-ka \
locale-plasma6-vault-ko \
locale-plasma6-vault-lt \
locale-plasma6-vault-lv \
locale-plasma6-vault-ml \
locale-plasma6-vault-nl \
locale-plasma6-vault-nn \
locale-plasma6-vault-pa \
locale-plasma6-vault-pl \
locale-plasma6-vault-pt \
locale-plasma6-vault-pt-BR \
locale-plasma6-vault-ro \
locale-plasma6-vault-ru \
locale-plasma6-vault-sk \
locale-plasma6-vault-sl \
locale-plasma6-vault-sr \
locale-plasma6-vault-sr@ijekavian \
locale-plasma6-vault-sr@ijekavianlatin \
locale-plasma6-vault-sr@latin \
locale-plasma6-vault-sv \
locale-plasma6-vault-tr \
locale-plasma6-vault-uk \
locale-plasma6-vault-zh-CN \
locale-plasma6-vault-zh-TW \
plasma6-vault-lang \
plasma6-vault-lang-all"

RDEPENDS:${PN} += "plasma6-vault"

inherit rpm
