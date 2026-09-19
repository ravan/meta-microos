SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze wallpaper theme."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "breeze6-wallpapers-6.7.5-1.1.noarch.rpm"
RPM_HASH = "9aa8cc825c6e5155284e4463e0c26bd4d4058f48184126a5d94161913d75ec95ec42ff0680a6d3b6100abb075faca17aee96f58fcf85dc39590ae2b794443977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-wallpapers \
breeze6-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
