SUMMARY = "Translations for package pcmanfm"
DESCRIPTION = "Provides translations for the 'pcmanfm' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0+git20251208.0908744"

RPM_NAME = "pcmanfm-lang-1.4.0+git20251208.0908744-1.4.noarch.rpm"
RPM_HASH = "5e8123dfb08669f973631ded1fd2267599350c775c04c24c5c8e26cdf7651090226de3de9f6f08683c7b405f606b8d1a5133d1c25dd0b345877e0f766065a859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pcmanfm-ar \
locale-pcmanfm-be \
locale-pcmanfm-bg \
locale-pcmanfm-bn \
locale-pcmanfm-ca \
locale-pcmanfm-cs \
locale-pcmanfm-da \
locale-pcmanfm-de \
locale-pcmanfm-el \
locale-pcmanfm-en-GB \
locale-pcmanfm-es \
locale-pcmanfm-et \
locale-pcmanfm-eu \
locale-pcmanfm-fa \
locale-pcmanfm-fi \
locale-pcmanfm-fr \
locale-pcmanfm-gl \
locale-pcmanfm-he \
locale-pcmanfm-hr \
locale-pcmanfm-hu \
locale-pcmanfm-id \
locale-pcmanfm-is \
locale-pcmanfm-it \
locale-pcmanfm-ja \
locale-pcmanfm-kk \
locale-pcmanfm-km \
locale-pcmanfm-ko \
locale-pcmanfm-lt \
locale-pcmanfm-lv \
locale-pcmanfm-ms \
locale-pcmanfm-nl \
locale-pcmanfm-pa \
locale-pcmanfm-pl \
locale-pcmanfm-pt \
locale-pcmanfm-pt-BR \
locale-pcmanfm-ro \
locale-pcmanfm-ru \
locale-pcmanfm-si \
locale-pcmanfm-sk \
locale-pcmanfm-sl \
locale-pcmanfm-sr \
locale-pcmanfm-sr@latin \
locale-pcmanfm-sv \
locale-pcmanfm-te \
locale-pcmanfm-th \
locale-pcmanfm-tr \
locale-pcmanfm-ug \
locale-pcmanfm-uk \
locale-pcmanfm-vi \
locale-pcmanfm-zh-CN \
locale-pcmanfm-zh-TW \
pcmanfm-lang \
pcmanfm-lang-all"

RDEPENDS:${PN} += "pcmanfm"

inherit rpm
