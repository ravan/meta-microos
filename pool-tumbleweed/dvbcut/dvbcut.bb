SUMMARY = "Qt application for cutting parts out of DVB streams"
DESCRIPTION = "DVBcut is a Qt application that allows you to select certain parts of an MPEG \
transport stream (as received via Digital Video Broadcasting, DVB) and save \
these parts into a single MPEG output file. It follows a `keyhole surgery'' \
approach where the input video and audio data is mostly kept unchanged, and \
only very few frames at the beginning and/or end of the selected range are re- \
encoded in order to obtain a valid MPEG file."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "0.7.4"

RPM_NAME = "dvbcut-0.7.4-5.5.aarch64.rpm"
RPM_HASH = "7b3ce434a580172e7144c21cedbfb29e9ff193aafccf7fa0de3210e20bed3f800b1ebeb6c2e005cb935d1ca0f943414479070ba7af654447fe24cd8189ed7225"

RPROVIDES:${PN} += "dvbcut"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
liba52.so.0 \
libao.so.4 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmad.so.0 \
libstdc++.so.6 \
libswscale.so.5.9"

inherit rpm
