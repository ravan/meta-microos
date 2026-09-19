SUMMARY = "Development Files for Parole"
DESCRIPTION = "This package contains development files for developing plugins for parole."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "parole-devel-4.20.0-1.5.aarch64.rpm"
RPM_HASH = "9b25568c6c7732c8838f39721dcd7cf9a3587dc3d22a305c728b4fe0f7148fa5eb9f998147d66db8235aa06c16f7c34793d6ce3724e21d485dfcc074c0f2f26a"

RPROVIDES:${PN} += "parole-devel"

RDEPENDS:${PN} += "parole \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxfce4util-1.0"

inherit rpm
