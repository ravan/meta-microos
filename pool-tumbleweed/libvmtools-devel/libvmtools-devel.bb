SUMMARY = "Open Virtual Machine Tools - Development headers"
DESCRIPTION = "Those are the development headers for libvmtools. They are needed \
if you intend to create own plugins for vmtoolsd."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "13.1.0"

RPM_NAME = "libvmtools-devel-13.1.0-2.3.aarch64.rpm"
RPM_HASH = "a5e750d7319439209a3018cea084c26d650238d55705d73fc3c9f8f95f26985ac4b1ce751da40de01c89e97ac3c9fd5e4e65ee5b8cf348b0dbd16fd736533e17"

RPROVIDES:${PN} += "libvmtools-devel \
pkgconfig-libDeployPkg \
pkgconfig-vmguestlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvmtools0"

inherit rpm
