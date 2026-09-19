SUMMARY = "Translations for package spectacle"
DESCRIPTION = "Provides translations for the 'spectacle' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "spectacle-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "d71bed6d81dfff7a8d8b26a8ab9cf178e972c884e2d06ed40aca17bf3d1c70d76e41f7a8985cf05657b4fde4ae4ec7fd1894df59afeff155447caf46db8adda8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spectacle-ar \
locale-spectacle-ast \
locale-spectacle-az \
locale-spectacle-bg \
locale-spectacle-ca \
locale-spectacle-ca@valencia \
locale-spectacle-cs \
locale-spectacle-da \
locale-spectacle-de \
locale-spectacle-el \
locale-spectacle-en-GB \
locale-spectacle-eo \
locale-spectacle-es \
locale-spectacle-et \
locale-spectacle-eu \
locale-spectacle-fi \
locale-spectacle-fr \
locale-spectacle-ga \
locale-spectacle-gl \
locale-spectacle-he \
locale-spectacle-hi \
locale-spectacle-hu \
locale-spectacle-ia \
locale-spectacle-id \
locale-spectacle-is \
locale-spectacle-it \
locale-spectacle-ja \
locale-spectacle-ka \
locale-spectacle-ko \
locale-spectacle-lt \
locale-spectacle-lv \
locale-spectacle-ml \
locale-spectacle-nb \
locale-spectacle-nl \
locale-spectacle-nn \
locale-spectacle-pa \
locale-spectacle-pl \
locale-spectacle-pt \
locale-spectacle-pt-BR \
locale-spectacle-ro \
locale-spectacle-ru \
locale-spectacle-sk \
locale-spectacle-sl \
locale-spectacle-sr \
locale-spectacle-sr@ijekavian \
locale-spectacle-sr@ijekavianlatin \
locale-spectacle-sr@latin \
locale-spectacle-sv \
locale-spectacle-ta \
locale-spectacle-tr \
locale-spectacle-uk \
locale-spectacle-zh-CN \
locale-spectacle-zh-TW \
spectacle-lang \
spectacle-lang-all"

RDEPENDS:${PN} += "spectacle"

inherit rpm
