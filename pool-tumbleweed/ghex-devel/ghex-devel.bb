SUMMARY = "GNOME Binary Editor -- Development Files"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "ghex-devel-50.3-1.1.aarch64.rpm"
RPM_HASH = "277bb563046cbef5cd23f4447edc7e6fcf20e9668cd8bf7abdbe725cc32fe3b31dd8afeab434132ff9a9b0451fb4edc73d75e501ebbc40b0528fe8cc48ce0df8"

RPROVIDES:${PN} += "ghex-devel \
pkgconfig-gtkhex-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkhex-4-1 \
pkgconfig-gtk4"

inherit rpm
