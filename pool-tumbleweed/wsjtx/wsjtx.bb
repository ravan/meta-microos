SUMMARY = "Weak signal hamradio software"
DESCRIPTION = "WSJT-X implements communication protocols or 'modes' called FST4, FST4W, FT4, \
FT8, JT4, JT9, JT65, Q65, MSK144, and WSPR, as well as one called Echo for \
detecting and measuring your own radio signals reflected from the Moon. \
These modes were designed for making reliable, confirmed QSOs under extreme \
weak-signal conditions."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "wsjtx-2.7.0-2.4.aarch64.rpm"
RPM_HASH = "03e00c03fd670ee8d511ae15d640c8a66b1ee57a5d933f4e96d108ec429b9fe7f7bb1d713164aeb4d5215fe3e1ed3691eea19543f01676cfe087f906c4c56717"

RPROVIDES:${PN} += "wsjtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5SerialPort.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libboost-filesystem.so.1.91.0 \
libboost-log-setup.so.1.91.0 \
libboost-log.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgomp.so.1 \
libhamlib.so.4 \
libm.so.6 \
libmvec.so.1 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
