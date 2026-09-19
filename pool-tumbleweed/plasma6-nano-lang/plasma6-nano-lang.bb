SUMMARY = "Translations for package plasma6-nano"
DESCRIPTION = "Provides translations for the 'plasma6-nano' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-nano-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "6add6f115e34fdad5a7d85316f052f3f5f9a3863ac4eb3a6f60399092229d365540c38453c7c552f6903a5627c516158c7ebb5df34077e27247cad7eb9d7c153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-nano-ar \
locale-plasma6-nano-ast \
locale-plasma6-nano-az \
locale-plasma6-nano-bg \
locale-plasma6-nano-ca \
locale-plasma6-nano-ca@valencia \
locale-plasma6-nano-cs \
locale-plasma6-nano-da \
locale-plasma6-nano-de \
locale-plasma6-nano-el \
locale-plasma6-nano-en-GB \
locale-plasma6-nano-eo \
locale-plasma6-nano-es \
locale-plasma6-nano-et \
locale-plasma6-nano-eu \
locale-plasma6-nano-fi \
locale-plasma6-nano-fr \
locale-plasma6-nano-ga \
locale-plasma6-nano-gl \
locale-plasma6-nano-he \
locale-plasma6-nano-hi \
locale-plasma6-nano-hu \
locale-plasma6-nano-ia \
locale-plasma6-nano-id \
locale-plasma6-nano-is \
locale-plasma6-nano-it \
locale-plasma6-nano-ja \
locale-plasma6-nano-ka \
locale-plasma6-nano-ko \
locale-plasma6-nano-lt \
locale-plasma6-nano-lv \
locale-plasma6-nano-nl \
locale-plasma6-nano-nn \
locale-plasma6-nano-pa \
locale-plasma6-nano-pl \
locale-plasma6-nano-pt \
locale-plasma6-nano-pt-BR \
locale-plasma6-nano-ro \
locale-plasma6-nano-ru \
locale-plasma6-nano-sk \
locale-plasma6-nano-sl \
locale-plasma6-nano-sv \
locale-plasma6-nano-ta \
locale-plasma6-nano-tr \
locale-plasma6-nano-uk \
locale-plasma6-nano-zh-CN \
locale-plasma6-nano-zh-TW \
plasma6-nano-lang \
plasma6-nano-lang-all"

RDEPENDS:${PN} += "plasma6-nano"

inherit rpm
