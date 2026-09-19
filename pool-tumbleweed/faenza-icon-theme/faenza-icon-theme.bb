SUMMARY = "Faenza Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-1.3.1-1.12.noarch.rpm"
RPM_HASH = "f06be70509435bda985b392958cb753b1fc06da55f743cab9a5afe7f0cc10a51662e5804ef0052bf1070ebb8ae3b8a4ce07b1c83ca0dae8fa521917ad3413bad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-icon-theme"

inherit rpm
