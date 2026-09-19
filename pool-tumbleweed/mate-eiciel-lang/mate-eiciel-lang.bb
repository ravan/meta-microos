SUMMARY = "Translations for package mate-eiciel"
DESCRIPTION = "Provides translations for the 'mate-eiciel' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "mate-eiciel-lang-1.20.1-2.22.noarch.rpm"
RPM_HASH = "42627a27aed32072420f89cd0b3c0c8c8134ab9c8225f24ff52a056b4acdeca05b3efc422edecf3d18868aecc759cdec4604f6e99c3823b27599fad84f6dbb03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-eiciel-ar \
locale-mate-eiciel-ca \
locale-mate-eiciel-cs \
locale-mate-eiciel-de \
locale-mate-eiciel-en-GB \
locale-mate-eiciel-en-US \
locale-mate-eiciel-es \
locale-mate-eiciel-fr \
locale-mate-eiciel-hu \
locale-mate-eiciel-it \
locale-mate-eiciel-ja \
locale-mate-eiciel-ko \
locale-mate-eiciel-nl \
locale-mate-eiciel-pl \
locale-mate-eiciel-pt-BR \
locale-mate-eiciel-ru \
locale-mate-eiciel-sv \
locale-mate-eiciel-zh-CN \
locale-mate-eiciel-zh-TW \
mate-eiciel-lang \
mate-eiciel-lang-all"

RDEPENDS:${PN} += "mate-eiciel"

inherit rpm
