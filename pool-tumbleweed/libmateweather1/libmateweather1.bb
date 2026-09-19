SUMMARY = "MATE Weather shared libraries"
DESCRIPTION = "libmateweather is a library to access weather information from \
online services for numerous locations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.2"

RPM_NAME = "libmateweather1-1.28.2-1.4.aarch64.rpm"
RPM_HASH = "e67424811008d6a33c87d63744f7e1b4b92e43d2446d82c7272a4af2b1a587325f170b287a992f1cce7c50dd2b260a34a2df0b310c797f13db4cb883c2c8ce13"

RPROVIDES:${PN} += "libmateweather \
libmateweather.so.1 \
libmateweather1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libsoup-2.4.so.1 \
libxml2.so.16 \
mateweather-common"

inherit rpm
