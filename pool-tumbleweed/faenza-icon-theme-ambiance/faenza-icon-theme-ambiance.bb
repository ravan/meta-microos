SUMMARY = "Faenza-Ambiance Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items. \
 \
Faenza-Ambiance is suitable with dark panel and toolbars."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-ambiance-1.3.1-1.12.noarch.rpm"
RPM_HASH = "8e716a15acc372f80f52213cac9e9afc05240f0b9211180b4f40b9e9c045eb5595903b20b653e8c5c62277e13b8a72f70fbeb887ade4919b855c8248763ec557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-ambiance"

RDEPENDS:${PN} += "/usr/bin/sh \
faenza-icon-theme-darkest"

inherit rpm
