SUMMARY = "Qt 6 Quick3DIblBaker library"
DESCRIPTION = "The Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DIblBaker6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ef05df822e125f212c5b61048f52607a897ae7f6c2666e25d8a4f4805ec567996a83a0ce641ef51fe33821a95cfc312c9fee5a9faa56e031a8fe348a3d90a942"

RPROVIDES:${PN} += "libQt6Quick3DIblBaker.so.6 \
libQt6Quick3DIblBaker6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
