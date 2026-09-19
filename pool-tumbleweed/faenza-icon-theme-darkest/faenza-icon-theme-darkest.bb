SUMMARY = "Faenza-Dark Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-darkest-1.3.1-1.12.noarch.rpm"
RPM_HASH = "22e75fce32ca05d7654be3a301ad49efc224a595d3f5cff988a74ac0963f9316b973b2158433e6d68e56e74fbb181c60aac75c29a7077ae21d77ef07aaabd8a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-darkest"

RDEPENDS:${PN} += "/usr/bin/sh \
faenza-icon-theme-dark"

inherit rpm
