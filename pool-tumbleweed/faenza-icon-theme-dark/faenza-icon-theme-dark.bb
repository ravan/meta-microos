SUMMARY = "Faenza-Dark Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-dark-1.3.1-1.12.noarch.rpm"
RPM_HASH = "bc2941c33124119eaaa97a111edaf828257adb7ab5c70f8251d235bb82f54f128d14be0f67adc7e64072489727f8e1d0295dd5e06d61610e5f922be7e508dddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-dark"

RDEPENDS:${PN} += "/usr/bin/sh \
faenza-icon-theme"

inherit rpm
