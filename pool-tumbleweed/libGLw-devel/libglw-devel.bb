SUMMARY = "Includes and more to develop MesaGLw applications"
DESCRIPTION = "This package contains all necessary include files needed \
to develop applications that require these."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libGLw-devel-8.0.0-7.13.aarch64.rpm"
RPM_HASH = "96855df77f5c58c789df960019fd75162c76d4d2bb0463e0cc5550021968065f1eac2c4d7489a46af80a8ce56efbe70eea8ed18826c3ccf2c84b7fcf85e3bac6"

RPROVIDES:${PN} += "libGLw-devel \
pkgconfig-glw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
GLw1 \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xt"

inherit rpm
