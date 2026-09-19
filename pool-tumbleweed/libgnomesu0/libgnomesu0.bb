SUMMARY = "GNOME su Library"
DESCRIPTION = "Libgnomesu is a library for providing superuser privileges to GNOME \
applications. It supports sudo, consolehelper, PAM, and su."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.10"

RPM_NAME = "libgnomesu0-2.0.10-1.5.aarch64.rpm"
RPM_HASH = "363bc1a48bb1d84c0bb8f76916e62073258c035a022c61e78178ced7529aebdf5fd657faa3920bcee3bd2160051aba6fe3fa46655b5201a95a664270e9c21c82"

RPROVIDES:${PN} += "libgnomesu.so.0 \
libgnomesu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgnomesu \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
