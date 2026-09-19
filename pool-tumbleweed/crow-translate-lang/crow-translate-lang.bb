SUMMARY = "Translations for package crow-translate"
DESCRIPTION = "Provides translations for the 'crow-translate' package."
LICENSE = "GPL-3.0-only"

PV = "3.1.0"

RPM_NAME = "crow-translate-lang-3.1.0-2.5.noarch.rpm"
RPM_HASH = "dcdd96d14e25639bcca566808e33bdc0a77e5240901d5f5ae4f17eb903e9b22def82043aa79f78afc50762a8b2fea6211d528d77cc13b4abd415d4938ab432f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crow-translate-lang \
crow-translate-lang-all \
locale-crow-translate-ar \
locale-crow-translate-az \
locale-crow-translate-be \
locale-crow-translate-ca \
locale-crow-translate-ca@valencia \
locale-crow-translate-cs \
locale-crow-translate-de \
locale-crow-translate-el \
locale-crow-translate-en-GB \
locale-crow-translate-eo \
locale-crow-translate-es \
locale-crow-translate-et \
locale-crow-translate-eu \
locale-crow-translate-fi \
locale-crow-translate-fr \
locale-crow-translate-gl \
locale-crow-translate-hi \
locale-crow-translate-hr \
locale-crow-translate-hu \
locale-crow-translate-id \
locale-crow-translate-it \
locale-crow-translate-ka \
locale-crow-translate-ko \
locale-crow-translate-lv \
locale-crow-translate-ms \
locale-crow-translate-nl \
locale-crow-translate-pl \
locale-crow-translate-pt \
locale-crow-translate-pt-BR \
locale-crow-translate-ru \
locale-crow-translate-sl \
locale-crow-translate-sq \
locale-crow-translate-sv \
locale-crow-translate-tr \
locale-crow-translate-ug \
locale-crow-translate-uk \
locale-crow-translate-zh-CN \
locale-crow-translate-zh-TW"

RDEPENDS:${PN} += "crow-translate"

inherit rpm
