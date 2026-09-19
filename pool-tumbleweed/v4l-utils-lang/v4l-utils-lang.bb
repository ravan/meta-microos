SUMMARY = "Translations for package v4l-utils"
DESCRIPTION = "Provides translations for the 'v4l-utils' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.32.0"

RPM_NAME = "v4l-utils-lang-1.32.0-2.4.noarch.rpm"
RPM_HASH = "341977a281ea85a2c689e3cc9a90cab68c6dbf3016207cfeb371c55730150c7ae98d5d701864a3f25ca98c26f672b010217e1e3cf6fabe8f782075e4d3e14c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-v4l-utils-ca \
locale-v4l-utils-de \
locale-v4l-utils-fr \
locale-v4l-utils-pt-BR \
locale-v4l-utils-uk \
v4l-utils-lang \
v4l-utils-lang-all"

RDEPENDS:${PN} += "v4l-utils"

inherit rpm
