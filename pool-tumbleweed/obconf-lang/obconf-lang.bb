SUMMARY = "Translations for package obconf"
DESCRIPTION = "Provides translations for the 'obconf' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.4"

RPM_NAME = "obconf-lang-2.0.4-10.8.noarch.rpm"
RPM_HASH = "1d7841c4fb70688d181835db454b442dc2b13662cf239f522f9c8cb79ebfb3a635f1cfc15cea7a606a582d81da14a7f9f4b70b0fcdef4dd91c95d6c35aac6a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-obconf-ar \
locale-obconf-be \
locale-obconf-cs \
locale-obconf-da \
locale-obconf-de \
locale-obconf-el \
locale-obconf-en@boldquot \
locale-obconf-en@quot \
locale-obconf-es \
locale-obconf-et \
locale-obconf-fi \
locale-obconf-fr \
locale-obconf-he \
locale-obconf-hr \
locale-obconf-hu \
locale-obconf-it \
locale-obconf-ja \
locale-obconf-lt \
locale-obconf-lv \
locale-obconf-nb \
locale-obconf-nl \
locale-obconf-pl \
locale-obconf-pt-BR \
locale-obconf-ro \
locale-obconf-ru \
locale-obconf-sr \
locale-obconf-sr@latin \
locale-obconf-sv \
locale-obconf-tr \
locale-obconf-zh-CN \
locale-obconf-zh-TW \
obconf-lang \
obconf-lang-all"

RDEPENDS:${PN} += "obconf"

inherit rpm
