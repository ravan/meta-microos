SUMMARY = "Faenza-Mint Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-mint-1.3.1-1.12.noarch.rpm"
RPM_HASH = "e008fb3f710f2bdb35b3f0ee671f9b1d4f250e2ac02323964788296c0d21b07bb5e23205ef124688f58a20e2bff08c35e6b8c8750517c28bcafd037ac7b6f4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-mint"

RDEPENDS:${PN} += "/usr/bin/sh \
faenza-icon-theme-dark"

inherit rpm
