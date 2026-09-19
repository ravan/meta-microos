SUMMARY = "GNOME su Library"
DESCRIPTION = "Libgnomesu is a library for providing superuser privileges to GNOME \
applications. It supports sudo, consolehelper, PAM, and su."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.10"

RPM_NAME = "libgnomesu-2.0.10-1.5.aarch64.rpm"
RPM_HASH = "de9a6d893687302a4158d289d69ae7745e044af44ebf0ef8a387a699ba20936430fa0e28fd82409a09473581825d71e9b73d96fceee3928cc7057b0936a1cf56"

RPROVIDES:${PN} += "libgnomesu"

RDEPENDS:${PN} += "/usr/bin/sh \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnomesu.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpam.so.0 \
pam \
permissions"

inherit rpm
