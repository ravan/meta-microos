SUMMARY = "Translations for package xdg-desktop-portal-kde6"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal-kde6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "xdg-desktop-portal-kde6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "7314e6728e77ad60d8fc2ea8093bc93994e0cae75fe8957fc25462b8685b1e90f8f74bab6623c18ca7f96765fe2f882e9cdbe39face919f2ed9b5ccf08e038ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xdg-desktop-portal-kde6-ar \
locale-xdg-desktop-portal-kde6-ast \
locale-xdg-desktop-portal-kde6-az \
locale-xdg-desktop-portal-kde6-bg \
locale-xdg-desktop-portal-kde6-ca \
locale-xdg-desktop-portal-kde6-ca@valencia \
locale-xdg-desktop-portal-kde6-cs \
locale-xdg-desktop-portal-kde6-da \
locale-xdg-desktop-portal-kde6-de \
locale-xdg-desktop-portal-kde6-el \
locale-xdg-desktop-portal-kde6-en-GB \
locale-xdg-desktop-portal-kde6-eo \
locale-xdg-desktop-portal-kde6-es \
locale-xdg-desktop-portal-kde6-et \
locale-xdg-desktop-portal-kde6-eu \
locale-xdg-desktop-portal-kde6-fi \
locale-xdg-desktop-portal-kde6-fr \
locale-xdg-desktop-portal-kde6-ga \
locale-xdg-desktop-portal-kde6-gl \
locale-xdg-desktop-portal-kde6-he \
locale-xdg-desktop-portal-kde6-hi \
locale-xdg-desktop-portal-kde6-hu \
locale-xdg-desktop-portal-kde6-ia \
locale-xdg-desktop-portal-kde6-id \
locale-xdg-desktop-portal-kde6-is \
locale-xdg-desktop-portal-kde6-it \
locale-xdg-desktop-portal-kde6-ja \
locale-xdg-desktop-portal-kde6-ka \
locale-xdg-desktop-portal-kde6-ko \
locale-xdg-desktop-portal-kde6-lt \
locale-xdg-desktop-portal-kde6-lv \
locale-xdg-desktop-portal-kde6-ml \
locale-xdg-desktop-portal-kde6-nb \
locale-xdg-desktop-portal-kde6-nl \
locale-xdg-desktop-portal-kde6-nn \
locale-xdg-desktop-portal-kde6-pa \
locale-xdg-desktop-portal-kde6-pl \
locale-xdg-desktop-portal-kde6-pt \
locale-xdg-desktop-portal-kde6-pt-BR \
locale-xdg-desktop-portal-kde6-ro \
locale-xdg-desktop-portal-kde6-ru \
locale-xdg-desktop-portal-kde6-sk \
locale-xdg-desktop-portal-kde6-sl \
locale-xdg-desktop-portal-kde6-sr \
locale-xdg-desktop-portal-kde6-sr@ijekavian \
locale-xdg-desktop-portal-kde6-sr@ijekavianlatin \
locale-xdg-desktop-portal-kde6-sr@latin \
locale-xdg-desktop-portal-kde6-sv \
locale-xdg-desktop-portal-kde6-ta \
locale-xdg-desktop-portal-kde6-tr \
locale-xdg-desktop-portal-kde6-uk \
locale-xdg-desktop-portal-kde6-zh-CN \
locale-xdg-desktop-portal-kde6-zh-TW \
xdg-desktop-portal-kde6-lang \
xdg-desktop-portal-kde6-lang-all"

RDEPENDS:${PN} += "xdg-desktop-portal-kde6"

inherit rpm
