SUMMARY = "Translations for package freeciv"
DESCRIPTION = "Provides translations for the 'freeciv' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "freeciv-lang-3.2.6-2.1.noarch.rpm"
RPM_HASH = "9170413bd39ec7ba542476854415e5841b3bbff78a16dc732d64d8d486d85720135f4b2871fce8d0f07cda7540a88eb8ab7766c4ad8037327fca30199423f457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freeciv-lang \
freeciv-lang-all \
locale-freeciv-ar \
locale-freeciv-bg \
locale-freeciv-ca \
locale-freeciv-cs \
locale-freeciv-da \
locale-freeciv-de \
locale-freeciv-el \
locale-freeciv-en-GB \
locale-freeciv-eo \
locale-freeciv-es \
locale-freeciv-et \
locale-freeciv-fa \
locale-freeciv-fi \
locale-freeciv-fr \
locale-freeciv-ga \
locale-freeciv-gd \
locale-freeciv-he \
locale-freeciv-hu \
locale-freeciv-id \
locale-freeciv-it \
locale-freeciv-ja \
locale-freeciv-ko \
locale-freeciv-lt \
locale-freeciv-nb \
locale-freeciv-nl \
locale-freeciv-pl \
locale-freeciv-pt \
locale-freeciv-pt-BR \
locale-freeciv-ro \
locale-freeciv-ru \
locale-freeciv-sk \
locale-freeciv-sr \
locale-freeciv-sv \
locale-freeciv-tr \
locale-freeciv-uk \
locale-freeciv-zh-CN \
locale-freeciv-zh-TW"

RDEPENDS:${PN} += "freeciv"

inherit rpm
