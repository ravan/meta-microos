SUMMARY = "Development package for libinstpatch"
DESCRIPTION = "This package includes the header files for libinstpatch."
LICENSE = "LGPL-2.1-only"

PV = "1.1.7"

RPM_NAME = "libinstpatch-devel-1.1.7-1.5.aarch64.rpm"
RPM_HASH = "d63543ab05876d629f22f990c837d7ad7be4168835ed921dafec80263c70ffc437c3d99090c8b6739b749bb302713b6b7d0d02108e2b871da503ffb20d6ec8d2"

RPROVIDES:${PN} += "libinstpatch-devel \
pkgconfig-libinstpatch-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinstpatch-1-0-2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-sndfile"

inherit rpm
