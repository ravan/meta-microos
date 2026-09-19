SUMMARY = "Translations for package appeditor"
DESCRIPTION = "Provides translations for the 'appeditor' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.5"

RPM_NAME = "appeditor-lang-1.1.5-1.12.noarch.rpm"
RPM_HASH = "1f08673a6e660546344a4c6f14c99b213309ec9434934361ad95638c711646a1a4502cfd4fcf721e6db4b9fee23e70ac708c030ee59f7a352a40b7a550f5639a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appeditor-lang \
appeditor-lang-all \
locale-appeditor-ca \
locale-appeditor-de \
locale-appeditor-es \
locale-appeditor-fr \
locale-appeditor-it \
locale-appeditor-ja \
locale-appeditor-lt \
locale-appeditor-pt \
locale-appeditor-pt-BR \
locale-appeditor-ru \
locale-appeditor-sv \
locale-appeditor-tr"

RDEPENDS:${PN} += "appeditor"

inherit rpm
