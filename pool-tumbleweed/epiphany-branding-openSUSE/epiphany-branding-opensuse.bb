SUMMARY = "GNOME Web Browser -- openSUSE default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the openSUSE default bookmarks and user \
agent string."
LICENSE = "GPL-2.0-or-later"

PV = "50.6"

RPM_NAME = "epiphany-branding-openSUSE-50.6-1.25.noarch.rpm"
RPM_HASH = "2978d3bbafec42433f5bca543e5900cd0e0469c73d8c00bec3b522326d154f7a4d1092e4d5b85cf2ab91e18d80cf7105daef8a347ac43ac28ccace626694f6d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding \
epiphany-branding-openSUSE"

RDEPENDS:${PN} += "epiphany"

inherit rpm
