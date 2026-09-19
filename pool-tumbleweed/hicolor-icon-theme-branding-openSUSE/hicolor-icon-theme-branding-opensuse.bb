SUMMARY = "Fallback Icon Theme -- openSUSE Icons"
DESCRIPTION = "This is the default fallback theme used by implementations of the icon \
theme specification. \
 \
This package provides openSUSE icons for hicolor-icon-theme."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "hicolor-icon-theme-branding-openSUSE-42.1-2.22.noarch.rpm"
RPM_HASH = "6badb174992cb9dd4b01eb973d3906722352d8a9607b20039ba1e602b50d203fb342fc266f1932e9e18d15e17d0f6a43a53833c78de94b2e621b2c51cb90b9ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hicolor-icon-theme-branding \
hicolor-icon-theme-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme"

inherit rpm
