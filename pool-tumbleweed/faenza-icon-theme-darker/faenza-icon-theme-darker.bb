SUMMARY = "Faenza-Dark Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-darker-1.3.1-1.12.noarch.rpm"
RPM_HASH = "ec5e26c1fcd30d9505da2177b88c754a6d081de602132e2449017f2ed058e95f9628915500631ec49c72c112ed916e6302ea5b45e1223a23ab9a16a3521822ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-darker"

RDEPENDS:${PN} += "/usr/bin/sh \
faenza-icon-theme-darkest"

inherit rpm
