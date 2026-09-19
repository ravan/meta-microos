SUMMARY = "Translations for package dcraw"
DESCRIPTION = "Provides translations for the 'dcraw' package."
LICENSE = "GPL-2.0-or-later"

PV = "9.28.0"

RPM_NAME = "dcraw-lang-9.28.0-5.10.noarch.rpm"
RPM_HASH = "44e08dd61f3429e094cc18b61071ccd8eb3f090fd483052bb6afb5a22cbb474dfcc11728f4adc0c8c1c207b01fc3f688f965d6ef6efbe8e055f50ce9393e01ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dcraw-lang \
dcraw-lang-all \
locale-dcraw-ca \
locale-dcraw-cs \
locale-dcraw-da \
locale-dcraw-de \
locale-dcraw-eo \
locale-dcraw-es \
locale-dcraw-fr \
locale-dcraw-hu \
locale-dcraw-it \
locale-dcraw-ja \
locale-dcraw-nl \
locale-dcraw-pl \
locale-dcraw-pt \
locale-dcraw-ro \
locale-dcraw-ru \
locale-dcraw-sv \
locale-dcraw-zh-CN \
locale-dcraw-zh-TW"

RDEPENDS:${PN} += "dcraw"

inherit rpm
