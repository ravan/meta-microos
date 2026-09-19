SUMMARY = "Qt-based GUI for sigrok"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
PulseView is a Qt-based GUI for sigrok."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0~20240813"

RPM_NAME = "pulseview-0.5.0~20240813-3.8.aarch64.rpm"
RPM_HASH = "519534903c5e60c0f9147ea7085385e4dcf57aebe7d393df400fcc96036cbbd220fcb20dc5bd4357b36970ee64769d9d30820dcc717f6cd0d60a74f9e100a002"

RPROVIDES:${PN} += "pulseview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libboost-filesystem.so.1.91.0 \
libboost-serialization.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libm.so.6 \
libsigrok.so.4 \
libsigrokcxx.so.4 \
libsigrokdecode.so.4 \
libstdc++.so.6"

inherit rpm
