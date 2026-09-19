SUMMARY = "Translations for package gnome-shell-extensions-common"
DESCRIPTION = "Provides translations for the 'gnome-shell-extensions-common' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gnome-shell-extensions-common-lang-50.3-1.1.noarch.rpm"
RPM_HASH = "608ed2b4b3640e6fdfaafb65d0c74d688997f2f4feebe1fe05f0c98c6f946dba8a384239ad6ba9af799bc009ea7574b1f8dceec8b4d77c7ef043c2616044107f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extensions-common-lang \
gnome-shell-extensions-common-lang-all \
locale-gnome-shell-extensions-common-af \
locale-gnome-shell-extensions-common-ar \
locale-gnome-shell-extensions-common-as \
locale-gnome-shell-extensions-common-be \
locale-gnome-shell-extensions-common-bg \
locale-gnome-shell-extensions-common-bn-IN \
locale-gnome-shell-extensions-common-bs \
locale-gnome-shell-extensions-common-ca \
locale-gnome-shell-extensions-common-ca@valencia \
locale-gnome-shell-extensions-common-cs \
locale-gnome-shell-extensions-common-da \
locale-gnome-shell-extensions-common-de \
locale-gnome-shell-extensions-common-el \
locale-gnome-shell-extensions-common-en-GB \
locale-gnome-shell-extensions-common-eo \
locale-gnome-shell-extensions-common-es \
locale-gnome-shell-extensions-common-et \
locale-gnome-shell-extensions-common-eu \
locale-gnome-shell-extensions-common-fa \
locale-gnome-shell-extensions-common-fi \
locale-gnome-shell-extensions-common-fr \
locale-gnome-shell-extensions-common-fur \
locale-gnome-shell-extensions-common-gd \
locale-gnome-shell-extensions-common-gl \
locale-gnome-shell-extensions-common-gu \
locale-gnome-shell-extensions-common-he \
locale-gnome-shell-extensions-common-hi \
locale-gnome-shell-extensions-common-hr \
locale-gnome-shell-extensions-common-hu \
locale-gnome-shell-extensions-common-ia \
locale-gnome-shell-extensions-common-id \
locale-gnome-shell-extensions-common-is \
locale-gnome-shell-extensions-common-it \
locale-gnome-shell-extensions-common-ja \
locale-gnome-shell-extensions-common-ka \
locale-gnome-shell-extensions-common-kk \
locale-gnome-shell-extensions-common-km \
locale-gnome-shell-extensions-common-kn \
locale-gnome-shell-extensions-common-ko \
locale-gnome-shell-extensions-common-lt \
locale-gnome-shell-extensions-common-lv \
locale-gnome-shell-extensions-common-ml \
locale-gnome-shell-extensions-common-mr \
locale-gnome-shell-extensions-common-ms \
locale-gnome-shell-extensions-common-nb \
locale-gnome-shell-extensions-common-ne \
locale-gnome-shell-extensions-common-nl \
locale-gnome-shell-extensions-common-oc \
locale-gnome-shell-extensions-common-or \
locale-gnome-shell-extensions-common-pa \
locale-gnome-shell-extensions-common-pl \
locale-gnome-shell-extensions-common-pt \
locale-gnome-shell-extensions-common-pt-BR \
locale-gnome-shell-extensions-common-ro \
locale-gnome-shell-extensions-common-ru \
locale-gnome-shell-extensions-common-sk \
locale-gnome-shell-extensions-common-sl \
locale-gnome-shell-extensions-common-sr \
locale-gnome-shell-extensions-common-sr@latin \
locale-gnome-shell-extensions-common-sv \
locale-gnome-shell-extensions-common-ta \
locale-gnome-shell-extensions-common-te \
locale-gnome-shell-extensions-common-th \
locale-gnome-shell-extensions-common-tr \
locale-gnome-shell-extensions-common-uk \
locale-gnome-shell-extensions-common-vi \
locale-gnome-shell-extensions-common-zh-CN \
locale-gnome-shell-extensions-common-zh-HK \
locale-gnome-shell-extensions-common-zh-TW"

RDEPENDS:${PN} += "gnome-shell-extensions-common"

inherit rpm
