SUMMARY = "Add Flathub repository to system flatpak"
DESCRIPTION = "Flathub is a widely used repository for Flatpak applications. This package \
adds the Flathub repository to the list of system flatpak remotes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.2"

RPM_NAME = "flatpak-remote-flathub-1.18.2-1.1.noarch.rpm"
RPM_HASH = "380e1379958061099323f28f089a153fbca24fd4f011385116f694beb5c1d1a26856c00d0d51cb1108ec615545d4909a37db862567dbad1826cd3759ee20ba74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-flatpak-remote-flathub \
flatpak-remote-flathub"

RDEPENDS:${PN} += "/usr/bin/sh \
flatpak \
sed"

inherit rpm
