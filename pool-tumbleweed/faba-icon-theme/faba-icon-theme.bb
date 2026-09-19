SUMMARY = "Faba Icon theme"
DESCRIPTION = "Faba is a modern icon theme with Tango influences."
LICENSE = "LGPL-3.0-or-later | CC-BY-SA-4.0"

PV = "4.3"

RPM_NAME = "faba-icon-theme-4.3-1.16.noarch.rpm"
RPM_HASH = "9ee43d8eadbe5560cedd41be33e904a03acdfbb4556fc2f8892cbb9e6afb5a683890cbb2e251f6578571ac4207843441f43620a16c6ca3f30cbec5e5c00d3506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faba-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-icon-theme"

inherit rpm
