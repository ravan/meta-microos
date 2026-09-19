SUMMARY = "Qt 5 PlatformHeaders"
DESCRIPTION = "Qt 5 PlatformHeaders."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5PlatformHeaders-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "45d2118469dd72f4ad2df8eb6082723d49b786fa06781e8058aeff27b1d106f29ec38b7526ac56df9a66c19aac13a5b414c9f277dbb2a31b84d2a5f4afd1869c"

RPROVIDES:${PN} += "libQt5PlatformHeaders-devel"

RDEPENDS:${PN} += "Mesa-libGLESv3-devel \
libQt5Core-devel \
libQt5Gui-devel \
pkgconfig-egl \
pkgconfig-glesv2 \
pkgconfig-x11"

inherit rpm
