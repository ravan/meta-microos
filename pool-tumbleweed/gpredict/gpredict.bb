SUMMARY = "Realtime satellite tracking and orbit prediction application"
DESCRIPTION = "Gpredict is a real-time satellite tracking and orbit prediction \
application. It can track a large number of satellites and display \
their position and other data in lists, tables, maps, and polar plots \
(radar view). Gpredict can also predict the time of future passes for a \
satellite, and provide you with detailed information about each pass."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "2.6"

RPM_NAME = "gpredict-2.6-1.1.aarch64.rpm"
RPM_HASH = "413685156d7f52e7a66f04b88beae718000270eeb99eaa5723554d4ce1df2dd90f5e11148a202b03354f95d4b6e9c5eb0e2919126059d0f001856b48378f0a97"

RPROVIDES:${PN} += "gpredict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgps.so.32 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
