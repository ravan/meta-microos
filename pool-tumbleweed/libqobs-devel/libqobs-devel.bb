SUMMARY = "Development files for libqobs"
DESCRIPTION = "This package contains the development files for libqobs, a Qt-based \
Open Build Service (OBS) library."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "libqobs-devel-3.0.0-1.5.aarch64.rpm"
RPM_HASH = "3b44bd792227fdddac9d366b0c7a249af855cb7ee1eca81590eeae0e7a8dff63f00e1d47593df2c8d2745846ed67cc053eb7b1ab582235bd7893c9398dbadef0"

RPROVIDES:${PN} += "libqobs-devel \
pkgconfig-libqobs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqobs3 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Network"

inherit rpm
