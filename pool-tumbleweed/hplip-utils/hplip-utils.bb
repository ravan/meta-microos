SUMMARY = "HPLIP GUI utilities"
DESCRIPTION = "The Hewlett-Packard Linux Imaging and Printing project (HPLIP) provides \
support for HP printers, scanners, and all-in-one devices. \
 \
This package contains graphical and command line utilities with extended \
functionality, specifically 'hp-toolbox'. It is not necessary for printing \
and scanning with HP devices. \
 \
For setting up new devices, install hplip-driver-* or hplip-ppds-* packages."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-utils-3.26.4-2.2.aarch64.rpm"
RPM_HASH = "e5962e0912b49e993990d6d264de8c883c9c078ebfc9253496c06665b33538c625beaa81f3f7109e6486cdb71cebeffbce0daf55012f3b492b894dcc8dde1f01"

RPROVIDES:${PN} += "config-hplip-utils \
hplip-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
hplip-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3-dbus-python \
python3-gobject \
python3-qt5"

inherit rpm
