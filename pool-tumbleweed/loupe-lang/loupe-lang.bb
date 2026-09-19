SUMMARY = "Translations for package loupe"
DESCRIPTION = "Provides translations for the 'loupe' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "loupe-lang-50.0-1.4.noarch.rpm"
RPM_HASH = "bbb7580475955dfcf79744d4283808b9f32d9ab2c248897075646d105f798b9a29f88414e71e006a7df239187af30bfdb92f5b3f36f5ecfdb5aa5fc129ab9d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-loupe-ar \
locale-loupe-be \
locale-loupe-bg \
locale-loupe-ca \
locale-loupe-cs \
locale-loupe-da \
locale-loupe-de \
locale-loupe-el \
locale-loupe-en-GB \
locale-loupe-eo \
locale-loupe-es \
locale-loupe-eu \
locale-loupe-fa \
locale-loupe-fi \
locale-loupe-fr \
locale-loupe-fur \
locale-loupe-gl \
locale-loupe-he \
locale-loupe-hi \
locale-loupe-hu \
locale-loupe-ia \
locale-loupe-id \
locale-loupe-it \
locale-loupe-ja \
locale-loupe-ka \
locale-loupe-kk \
locale-loupe-ko \
locale-loupe-lt \
locale-loupe-lv \
locale-loupe-nb \
locale-loupe-ne \
locale-loupe-nl \
locale-loupe-nn \
locale-loupe-oc \
locale-loupe-pa \
locale-loupe-pl \
locale-loupe-pt \
locale-loupe-pt-BR \
locale-loupe-ro \
locale-loupe-ru \
locale-loupe-sk \
locale-loupe-sl \
locale-loupe-sr \
locale-loupe-sr@latin \
locale-loupe-sv \
locale-loupe-th \
locale-loupe-tr \
locale-loupe-ug \
locale-loupe-uk \
locale-loupe-vi \
locale-loupe-zh-CN \
locale-loupe-zh-TW \
loupe-lang \
loupe-lang-all"

RDEPENDS:${PN} += "loupe"

inherit rpm
