SUMMARY = "GNOME Web Browser -- Upstream default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the upstream default bookmarks and user agent \
string."
LICENSE = "GPL-3.0-or-later"

PV = "50.6"

RPM_NAME = "epiphany-branding-upstream-50.6-2.1.noarch.rpm"
RPM_HASH = "9b915a947e12a879dc101181e38de0c00272212c38c9daa2f236bafaf6f5b2bf8eb2f3aa9351415971eb9299adfd14d4d6ccb6ff26f29c7685b54a0201623a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding \
epiphany-branding-upstream"

RDEPENDS:${PN} += "epiphany"

inherit rpm
