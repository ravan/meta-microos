SUMMARY = "Themes for the IceWM Window Manager"
DESCRIPTION = "This package contains a collection of themes for the popular IceWM \
window manager. Most of them have been taken from the original 0.9.42 \
themes package. Others have been taken from http://icewm.themes.org."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1"

RPM_NAME = "icewm-themes-0.1-689.10.noarch.rpm"
RPM_HASH = "307f0d0070167ee2c1b25de81b1ee62d0af781ae47cbf01fb753340d532ae6b0a974cedf50b6b404e0fadfedb4104cc0490543adb87c14326aebe0717a9c9e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icewm-themes"

RDEPENDS:${PN} += "icewm"

inherit rpm
