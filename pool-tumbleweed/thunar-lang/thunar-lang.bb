SUMMARY = "Translations for package thunar"
DESCRIPTION = "Provides translations for the 'thunar' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.10"

RPM_NAME = "thunar-lang-4.20.10-1.1.noarch.rpm"
RPM_HASH = "427d5119e5f1dac11334818ee63287e1a0b603f383c84e1dbb64fe329438581ed2916e2ed35e55be01e237531e578fd7d25f44fb95971ebbfaf775702071da16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-ar \
locale-thunar-ast \
locale-thunar-be \
locale-thunar-bg \
locale-thunar-bn \
locale-thunar-ca \
locale-thunar-cs \
locale-thunar-da \
locale-thunar-de \
locale-thunar-el \
locale-thunar-en-AU \
locale-thunar-en-GB \
locale-thunar-eo \
locale-thunar-es \
locale-thunar-et \
locale-thunar-eu \
locale-thunar-fi \
locale-thunar-fr \
locale-thunar-gl \
locale-thunar-he \
locale-thunar-hr \
locale-thunar-hu \
locale-thunar-id \
locale-thunar-is \
locale-thunar-it \
locale-thunar-ja \
locale-thunar-ka \
locale-thunar-kk \
locale-thunar-ko \
locale-thunar-lt \
locale-thunar-lv \
locale-thunar-ms \
locale-thunar-nb \
locale-thunar-nl \
locale-thunar-nn \
locale-thunar-oc \
locale-thunar-pa \
locale-thunar-pl \
locale-thunar-pt \
locale-thunar-pt-BR \
locale-thunar-ro \
locale-thunar-ru \
locale-thunar-si \
locale-thunar-sk \
locale-thunar-sl \
locale-thunar-sq \
locale-thunar-sr \
locale-thunar-sv \
locale-thunar-te \
locale-thunar-th \
locale-thunar-tr \
locale-thunar-ug \
locale-thunar-uk \
locale-thunar-vi \
locale-thunar-zh-CN \
locale-thunar-zh-HK \
locale-thunar-zh-TW \
thunar-lang \
thunar-lang-all"

RDEPENDS:${PN} += "thunar"

inherit rpm
