SUMMARY = "Visualisation tool for trace-cmd data"
DESCRIPTION = "trace-cmd reporting can be extremely verbose making it difficult to \
analyse. kernelshark visualises the data so that it can be filtered \
or trimmed."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.4.0"

RPM_NAME = "kernelshark-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "bcc7f6f773a51dbd3632fff79a6865dd3f3b5d32b09708776221e81506f3bbfd538fb4cba18dccb048a11573214bb27b3bb4cabecc8d3f80a3540322a6f2a08c"

RPROVIDES:${PN} += "kernelshark \
libkshark-gui.so.2.4.0 \
libkshark-plot.so.2.4.0 \
libkshark.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLESv2.so.2 \
libGLU.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6StateMachine.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libgomp.so.1 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libtracecmd.so.1 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
