SUMMARY = "Simple morse decoder for X11"
DESCRIPTION = "Xdemorse is a simple morse decoder for X11."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.7"

RPM_NAME = "xdemorse-3.6.7-1.7.aarch64.rpm"
RPM_HASH = "2e17c8556a4d244e49a434575b989892a09d0aebd8405ab891f7694a932d39370161f96e86d0ff4682729bfe662c72577049c332ff6c2c77ac4cbe4ef1131388"

RPROVIDES:${PN} += "xdemorse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
