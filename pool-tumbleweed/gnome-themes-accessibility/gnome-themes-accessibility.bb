SUMMARY = "Accessibility GNOME Themes"
DESCRIPTION = "This package contains high-contrast and low-contrast themes for GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gnome-themes-accessibility-3.28-3.5.noarch.rpm"
RPM_HASH = "6f840b54dbb16e263336a18497f947175f05477dfb320af68f40b3f2c4571f3f1104eef369be9844121af51432af4f262e796c8aaa42c8153abeda75d15f8def"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes-accessibility"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
