SUMMARY = "Translations for package thunar-archive-plugin"
DESCRIPTION = "Provides translations for the 'thunar-archive-plugin' package."
LICENSE = "LGPL-2.0-only"

PV = "0.6.0"

RPM_NAME = "thunar-archive-plugin-lang-0.6.0-1.6.noarch.rpm"
RPM_HASH = "2c30b89fea09b94b242c23a7162bf93bb67075c0795294b87fc929112235719f37de1bf2c211ba46428ae09074c57e01d1123c4f3ebc64612d43f2c8aedf4a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-archive-plugin-ar \
locale-thunar-archive-plugin-be \
locale-thunar-archive-plugin-bg \
locale-thunar-archive-plugin-ca \
locale-thunar-archive-plugin-cs \
locale-thunar-archive-plugin-da \
locale-thunar-archive-plugin-de \
locale-thunar-archive-plugin-el \
locale-thunar-archive-plugin-en-AU \
locale-thunar-archive-plugin-en-CA \
locale-thunar-archive-plugin-en-GB \
locale-thunar-archive-plugin-eo \
locale-thunar-archive-plugin-es \
locale-thunar-archive-plugin-et \
locale-thunar-archive-plugin-eu \
locale-thunar-archive-plugin-fi \
locale-thunar-archive-plugin-fr \
locale-thunar-archive-plugin-gl \
locale-thunar-archive-plugin-he \
locale-thunar-archive-plugin-hi \
locale-thunar-archive-plugin-hr \
locale-thunar-archive-plugin-hu \
locale-thunar-archive-plugin-id \
locale-thunar-archive-plugin-is \
locale-thunar-archive-plugin-it \
locale-thunar-archive-plugin-ja \
locale-thunar-archive-plugin-ko \
locale-thunar-archive-plugin-lt \
locale-thunar-archive-plugin-lv \
locale-thunar-archive-plugin-ms \
locale-thunar-archive-plugin-nb \
locale-thunar-archive-plugin-nl \
locale-thunar-archive-plugin-nn \
locale-thunar-archive-plugin-oc \
locale-thunar-archive-plugin-pa \
locale-thunar-archive-plugin-pl \
locale-thunar-archive-plugin-pt \
locale-thunar-archive-plugin-pt-BR \
locale-thunar-archive-plugin-ro \
locale-thunar-archive-plugin-ru \
locale-thunar-archive-plugin-sk \
locale-thunar-archive-plugin-sl \
locale-thunar-archive-plugin-sq \
locale-thunar-archive-plugin-sr \
locale-thunar-archive-plugin-sv \
locale-thunar-archive-plugin-th \
locale-thunar-archive-plugin-tr \
locale-thunar-archive-plugin-ug \
locale-thunar-archive-plugin-uk \
locale-thunar-archive-plugin-vi \
locale-thunar-archive-plugin-zh-CN \
locale-thunar-archive-plugin-zh-TW \
thunar-archive-plugin-lang \
thunar-archive-plugin-lang-all"

RDEPENDS:${PN} += "thunar-archive-plugin"

inherit rpm
