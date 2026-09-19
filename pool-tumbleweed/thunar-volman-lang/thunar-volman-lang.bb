SUMMARY = "Translations for package thunar-volman"
DESCRIPTION = "Provides translations for the 'thunar-volman' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "thunar-volman-lang-4.20.0-1.7.noarch.rpm"
RPM_HASH = "4b77e38be5a30451dc2ef92c2067c538cdd90809885fa0fd664bb9da5a8c12b4458ed13d6c4e32025f92c731e22267dac0ad9ac2f9c96275c431f2cfd51df378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-volman-ar \
locale-thunar-volman-be \
locale-thunar-volman-bg \
locale-thunar-volman-ca \
locale-thunar-volman-cs \
locale-thunar-volman-da \
locale-thunar-volman-de \
locale-thunar-volman-el \
locale-thunar-volman-en-AU \
locale-thunar-volman-en-CA \
locale-thunar-volman-en-GB \
locale-thunar-volman-es \
locale-thunar-volman-et \
locale-thunar-volman-eu \
locale-thunar-volman-fi \
locale-thunar-volman-fr \
locale-thunar-volman-gl \
locale-thunar-volman-he \
locale-thunar-volman-hi \
locale-thunar-volman-hr \
locale-thunar-volman-hu \
locale-thunar-volman-id \
locale-thunar-volman-is \
locale-thunar-volman-it \
locale-thunar-volman-ja \
locale-thunar-volman-ko \
locale-thunar-volman-lt \
locale-thunar-volman-lv \
locale-thunar-volman-ms \
locale-thunar-volman-nb \
locale-thunar-volman-nl \
locale-thunar-volman-nn \
locale-thunar-volman-oc \
locale-thunar-volman-pl \
locale-thunar-volman-pt \
locale-thunar-volman-pt-BR \
locale-thunar-volman-ro \
locale-thunar-volman-ru \
locale-thunar-volman-sk \
locale-thunar-volman-sl \
locale-thunar-volman-sq \
locale-thunar-volman-sr \
locale-thunar-volman-sv \
locale-thunar-volman-te \
locale-thunar-volman-th \
locale-thunar-volman-tr \
locale-thunar-volman-ug \
locale-thunar-volman-uk \
locale-thunar-volman-vi \
locale-thunar-volman-zh-CN \
locale-thunar-volman-zh-HK \
locale-thunar-volman-zh-TW \
thunar-volman-lang \
thunar-volman-lang-all"

RDEPENDS:${PN} += "thunar-volman"

inherit rpm
