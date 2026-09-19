SUMMARY = "Logging program for Amateur radio"
DESCRIPTION = "Xlog, a logging program for Amateur Radio Operators."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.25"

RPM_NAME = "xlog-2.0.25-2.5.aarch64.rpm"
RPM_HASH = "954adb54c78bf14e6dc5342c6848155e969f2e897fd4c6de3316f59cd6115846c1289affb32e61f799665319dffe025c70f3c5530612c5568a58fb5889f71c63"

RPROVIDES:${PN} += "xlog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libhamlib.so.4 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
