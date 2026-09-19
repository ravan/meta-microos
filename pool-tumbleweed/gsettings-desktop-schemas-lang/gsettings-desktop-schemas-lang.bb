SUMMARY = "Translations for package gsettings-desktop-schemas"
DESCRIPTION = "Provides translations for the 'gsettings-desktop-schemas' package."
LICENSE = "LGPL-2.1-or-later"

PV = "50.1"

RPM_NAME = "gsettings-desktop-schemas-lang-50.1-1.2.noarch.rpm"
RPM_HASH = "adbf26d11bac09439a0043ca49b7b1a6c53643a42868235dfb24308c9746d10151b2f229f6f7f61ba041e76539f864187c1cbe7721468d85a1854212912a7ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsettings-desktop-schemas-lang \
gsettings-desktop-schemas-lang-all \
locale-gsettings-desktop-schemas-as \
locale-gsettings-desktop-schemas-be \
locale-gsettings-desktop-schemas-bg \
locale-gsettings-desktop-schemas-bs \
locale-gsettings-desktop-schemas-ca \
locale-gsettings-desktop-schemas-ca@valencia \
locale-gsettings-desktop-schemas-cs \
locale-gsettings-desktop-schemas-da \
locale-gsettings-desktop-schemas-de \
locale-gsettings-desktop-schemas-el \
locale-gsettings-desktop-schemas-eo \
locale-gsettings-desktop-schemas-es \
locale-gsettings-desktop-schemas-eu \
locale-gsettings-desktop-schemas-fa \
locale-gsettings-desktop-schemas-fi \
locale-gsettings-desktop-schemas-fr \
locale-gsettings-desktop-schemas-fur \
locale-gsettings-desktop-schemas-gl \
locale-gsettings-desktop-schemas-gu \
locale-gsettings-desktop-schemas-he \
locale-gsettings-desktop-schemas-hi \
locale-gsettings-desktop-schemas-hr \
locale-gsettings-desktop-schemas-hu \
locale-gsettings-desktop-schemas-id \
locale-gsettings-desktop-schemas-is \
locale-gsettings-desktop-schemas-it \
locale-gsettings-desktop-schemas-ja \
locale-gsettings-desktop-schemas-ka \
locale-gsettings-desktop-schemas-kk \
locale-gsettings-desktop-schemas-lt \
locale-gsettings-desktop-schemas-lv \
locale-gsettings-desktop-schemas-ml \
locale-gsettings-desktop-schemas-ms \
locale-gsettings-desktop-schemas-nb \
locale-gsettings-desktop-schemas-ne \
locale-gsettings-desktop-schemas-nl \
locale-gsettings-desktop-schemas-oc \
locale-gsettings-desktop-schemas-or \
locale-gsettings-desktop-schemas-pa \
locale-gsettings-desktop-schemas-pl \
locale-gsettings-desktop-schemas-pt \
locale-gsettings-desktop-schemas-pt-BR \
locale-gsettings-desktop-schemas-ro \
locale-gsettings-desktop-schemas-ru \
locale-gsettings-desktop-schemas-sk \
locale-gsettings-desktop-schemas-sl \
locale-gsettings-desktop-schemas-sr \
locale-gsettings-desktop-schemas-sr@latin \
locale-gsettings-desktop-schemas-sv \
locale-gsettings-desktop-schemas-tr \
locale-gsettings-desktop-schemas-ug \
locale-gsettings-desktop-schemas-uk \
locale-gsettings-desktop-schemas-vi \
locale-gsettings-desktop-schemas-zh-CN \
locale-gsettings-desktop-schemas-zh-HK \
locale-gsettings-desktop-schemas-zh-TW"

RDEPENDS:${PN} += "gsettings-desktop-schemas"

inherit rpm
