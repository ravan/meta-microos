SUMMARY = "Translations for package thunar-media-tags-plugin"
DESCRIPTION = "Provides translations for the 'thunar-media-tags-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "thunar-media-tags-plugin-lang-0.6.0-1.5.noarch.rpm"
RPM_HASH = "56f60c81d4c9a6469d8f680a12f6d20e91745eb8f2dc024efd87d3e4ab99084f93fa5b46ed9ec3f9915eed1a77fc67ef1211877398fa356fe30e03d0d0abfcbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-media-tags-plugin-ar \
locale-thunar-media-tags-plugin-be \
locale-thunar-media-tags-plugin-bg \
locale-thunar-media-tags-plugin-ca \
locale-thunar-media-tags-plugin-cs \
locale-thunar-media-tags-plugin-da \
locale-thunar-media-tags-plugin-de \
locale-thunar-media-tags-plugin-el \
locale-thunar-media-tags-plugin-en-AU \
locale-thunar-media-tags-plugin-en-CA \
locale-thunar-media-tags-plugin-en-GB \
locale-thunar-media-tags-plugin-eo \
locale-thunar-media-tags-plugin-es \
locale-thunar-media-tags-plugin-et \
locale-thunar-media-tags-plugin-eu \
locale-thunar-media-tags-plugin-fi \
locale-thunar-media-tags-plugin-fr \
locale-thunar-media-tags-plugin-gl \
locale-thunar-media-tags-plugin-he \
locale-thunar-media-tags-plugin-hi \
locale-thunar-media-tags-plugin-hr \
locale-thunar-media-tags-plugin-hu \
locale-thunar-media-tags-plugin-id \
locale-thunar-media-tags-plugin-is \
locale-thunar-media-tags-plugin-it \
locale-thunar-media-tags-plugin-ja \
locale-thunar-media-tags-plugin-ko \
locale-thunar-media-tags-plugin-lt \
locale-thunar-media-tags-plugin-lv \
locale-thunar-media-tags-plugin-ms \
locale-thunar-media-tags-plugin-nb \
locale-thunar-media-tags-plugin-nl \
locale-thunar-media-tags-plugin-nn \
locale-thunar-media-tags-plugin-oc \
locale-thunar-media-tags-plugin-pa \
locale-thunar-media-tags-plugin-pl \
locale-thunar-media-tags-plugin-pt \
locale-thunar-media-tags-plugin-pt-BR \
locale-thunar-media-tags-plugin-ro \
locale-thunar-media-tags-plugin-ru \
locale-thunar-media-tags-plugin-sk \
locale-thunar-media-tags-plugin-sl \
locale-thunar-media-tags-plugin-sq \
locale-thunar-media-tags-plugin-sr \
locale-thunar-media-tags-plugin-sv \
locale-thunar-media-tags-plugin-th \
locale-thunar-media-tags-plugin-tr \
locale-thunar-media-tags-plugin-ug \
locale-thunar-media-tags-plugin-uk \
locale-thunar-media-tags-plugin-vi \
locale-thunar-media-tags-plugin-zh-CN \
locale-thunar-media-tags-plugin-zh-TW \
thunar-media-tags-plugin-lang \
thunar-media-tags-plugin-lang-all"

RDEPENDS:${PN} += "thunar-media-tags-plugin"

inherit rpm
