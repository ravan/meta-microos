SUMMARY = "Translations for package appstream-glib"
DESCRIPTION = "Provides translations for the 'appstream-glib' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "appstream-glib-lang-0.8.4-1.1.noarch.rpm"
RPM_HASH = "44488e42cc4c47724bf34897edf5e24c4eab71f3a75c153dced1d22c7e8fc46bd02ba557ea6cc6b17168f76e73154264e03e91abff976c73ab3e7a4fd97c5384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appstream-glib-lang \
appstream-glib-lang-all \
locale-appstream-glib-ca \
locale-appstream-glib-cs \
locale-appstream-glib-da \
locale-appstream-glib-de \
locale-appstream-glib-en-GB \
locale-appstream-glib-es \
locale-appstream-glib-fa \
locale-appstream-glib-fi \
locale-appstream-glib-fr \
locale-appstream-glib-fur \
locale-appstream-glib-gl \
locale-appstream-glib-hr \
locale-appstream-glib-hu \
locale-appstream-glib-id \
locale-appstream-glib-it \
locale-appstream-glib-ka \
locale-appstream-glib-ko \
locale-appstream-glib-lt \
locale-appstream-glib-oc \
locale-appstream-glib-pl \
locale-appstream-glib-pt \
locale-appstream-glib-pt-BR \
locale-appstream-glib-ru \
locale-appstream-glib-sk \
locale-appstream-glib-sl \
locale-appstream-glib-sr \
locale-appstream-glib-sr@latin \
locale-appstream-glib-sv \
locale-appstream-glib-tr \
locale-appstream-glib-uk \
locale-appstream-glib-zh-CN \
locale-appstream-glib-zh-TW"

RDEPENDS:${PN} += "appstream-glib"

inherit rpm
