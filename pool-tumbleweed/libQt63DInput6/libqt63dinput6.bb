SUMMARY = "Qt 6 3DInput library"
DESCRIPTION = "The Qt 6 3DInput library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DInput6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "37455cfbdcbf5314c2501e1bdb30115606ca38d497b28ed5da23efc2d01295a378da6360018636a907d6467666d3e3fae4c0dda955a0bbbafb4d8e1c11dee608"

RPROVIDES:${PN} += "libQt63DInput.so.6 \
libQt63DInput6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
