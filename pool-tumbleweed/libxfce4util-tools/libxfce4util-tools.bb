SUMMARY = "Tools for libxfce4util"
DESCRIPTION = "This package contains tools for libxfce4util."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.1"

RPM_NAME = "libxfce4util-tools-4.20.1-1.5.aarch64.rpm"
RPM_HASH = "f48b6dce2d90153a60be5a515cebbb9bac9e18f7e72ebc5b078056f44a426a75528b04859f8cd2e895c96186974793902b44ec226967886729545dfaba90287d"

RPROVIDES:${PN} += "libxfce4util-/usr/sbin/xfce4-kiosk-query \
libxfce4util-tools"

RDEPENDS:${PN} += "libc.so.6 \
libxfce4util.so.7"

inherit rpm
