SUMMARY = "GNOME Icon Theme - Legacy fallback icons"
DESCRIPTION = "A fullcolor icon theme providing fallback for legacy apps."
LICENSE = "CC-BY-SA-3.0 | LGPL-3.0-or-later"

PV = "46.2"

RPM_NAME = "adwaita-icon-theme-legacy-46.2-3.2.noarch.rpm"
RPM_HASH = "99108f6a6a31d63e0a5e67b51edbf5e1326fc9713d3c9f59ce16eca5aed71730b83adf62f79a952fbb9f3358f078732d0572f780a703c3fd6b2a61032708a751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adwaita-icon-theme-legacy \
pkgconfig-adwaita-icon-theme-legacy"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
