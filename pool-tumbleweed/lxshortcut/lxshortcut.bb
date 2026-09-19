SUMMARY = "Create shortcuts for LXDE"
DESCRIPTION = "LXShortcut is a small program used to edit application shortcuts \
created with freedesktop.org Desktop Entry spec."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "lxshortcut-1.4.1-2.5.aarch64.rpm"
RPM_HASH = "f1d8bef86198cc38eaac0062664240ff0619c1a7137c3170a35a2bac497ce75353570483e06a1f2b23c20cbd932ecdb75493139bb109f9a8766a33570dcfd12f"

RPROVIDES:${PN} += "lxshortcut"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfm-gtk3.so.4 \
libfm.so.4 \
libglib-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
