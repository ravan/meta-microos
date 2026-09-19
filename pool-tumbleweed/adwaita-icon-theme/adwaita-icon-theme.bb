SUMMARY = "GNOME Icon Theme"
DESCRIPTION = "The default GNOME icon theme, Adwaita."
LICENSE = "CC-BY-SA-3.0 | LGPL-3.0-or-later"

PV = "50.0+2"

RPM_NAME = "adwaita-icon-theme-50.0+2-2.1.noarch.rpm"
RPM_HASH = "7bc277709aaab66560cf21c2e9ebe6cd0ef31dd0b15bb5eb1f072355e00317633f1f9a6a0acd54ad166ac236c4c5e8978d5232c03d1a46f34fef8385a9f5de2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adwaita-icon-theme \
adwaita-icon-theme-devel \
pkgconfig-adwaita-icon-theme"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
