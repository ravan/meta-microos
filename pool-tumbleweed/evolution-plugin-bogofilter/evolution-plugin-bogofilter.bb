SUMMARY = "Bogofilter plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support for junk-mail filtering via bogofilter."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.60.2"

RPM_NAME = "evolution-plugin-bogofilter-3.60.2-1.2.aarch64.rpm"
RPM_HASH = "d3e9f97418f3775a0a3fd683f42e53b0c32282e0032b42896ab734bb1bfa519fca81c21c61ff989015fb9bdfbb3bbb28af50ba4aeb151479335254870e02fe8b"

RPROVIDES:${PN} += "evolution-plugin-bogofilter"

RDEPENDS:${PN} += "bogofilter \
evolution \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libedataserver-1.2.so.27 \
libemail-engine.so \
libevolution-util.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
