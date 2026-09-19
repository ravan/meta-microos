SUMMARY = "Translations for package plasma6-pa"
DESCRIPTION = "Provides translations for the 'plasma6-pa' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-pa-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "3aa427bcfa9c24fc616f9424b7a94380ced81eec6abd6cb323b4169c48bb657e6ce0817d49cd1d66db89bf866c79f4b9d406e33259ff859d8c5674711d37a72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-pa-ar \
locale-plasma6-pa-ast \
locale-plasma6-pa-az \
locale-plasma6-pa-bg \
locale-plasma6-pa-ca \
locale-plasma6-pa-ca@valencia \
locale-plasma6-pa-cs \
locale-plasma6-pa-da \
locale-plasma6-pa-de \
locale-plasma6-pa-el \
locale-plasma6-pa-en-GB \
locale-plasma6-pa-eo \
locale-plasma6-pa-es \
locale-plasma6-pa-et \
locale-plasma6-pa-eu \
locale-plasma6-pa-fi \
locale-plasma6-pa-fr \
locale-plasma6-pa-ga \
locale-plasma6-pa-gl \
locale-plasma6-pa-he \
locale-plasma6-pa-hi \
locale-plasma6-pa-hu \
locale-plasma6-pa-ia \
locale-plasma6-pa-id \
locale-plasma6-pa-is \
locale-plasma6-pa-it \
locale-plasma6-pa-ja \
locale-plasma6-pa-ka \
locale-plasma6-pa-ko \
locale-plasma6-pa-lt \
locale-plasma6-pa-lv \
locale-plasma6-pa-ml \
locale-plasma6-pa-nb \
locale-plasma6-pa-nl \
locale-plasma6-pa-nn \
locale-plasma6-pa-pa \
locale-plasma6-pa-pl \
locale-plasma6-pa-pt \
locale-plasma6-pa-pt-BR \
locale-plasma6-pa-ro \
locale-plasma6-pa-ru \
locale-plasma6-pa-sk \
locale-plasma6-pa-sl \
locale-plasma6-pa-sr \
locale-plasma6-pa-sr@ijekavian \
locale-plasma6-pa-sr@ijekavianlatin \
locale-plasma6-pa-sr@latin \
locale-plasma6-pa-sv \
locale-plasma6-pa-ta \
locale-plasma6-pa-tr \
locale-plasma6-pa-uk \
locale-plasma6-pa-zh-CN \
locale-plasma6-pa-zh-TW \
plasma6-pa-lang \
plasma6-pa-lang-all"

RDEPENDS:${PN} += "plasma6-pa"

inherit rpm
