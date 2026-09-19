SUMMARY = "Development files for sysprof"
DESCRIPTION = "The sysprof-devel package contains header files for developing \
applications that use sysprof."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "sysprof-devel-50.0-1.3.aarch64.rpm"
RPM_HASH = "4e200dc6020670d28852c018a033edcacc45fbd67c59e8561c854dc3a5c5e46be305de8a4abd4cb82c86235a82d8e56f832a1d923e14cf1fe00d2fa91159b67d"

RPROVIDES:${PN} += "pkgconfig-sysprof-6 \
pkgconfig-sysprof-capture-4 \
sysprof-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsysprof-6-6 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libdebuginfod \
pkgconfig-libdex-1 \
pkgconfig-libsystemd \
pkgconfig-polkit-gobject-1 \
sysprof"

inherit rpm
