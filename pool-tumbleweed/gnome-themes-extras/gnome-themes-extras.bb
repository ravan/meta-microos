SUMMARY = "Additional GNOME Themes"
DESCRIPTION = "This package contains several extra GNOME themes."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "2.22.0"

RPM_NAME = "gnome-themes-extras-2.22.0-80.8.noarch.rpm"
RPM_HASH = "e1a5455ac3ac7ba0060a607f2db77a9f0a9d313cd88435ed4b4140a668b382ca4138cb4be9ad4ad3780fa7c109d48e196900c9fec5471bdc9f94bd8d78d1a11d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-themes"

inherit rpm
