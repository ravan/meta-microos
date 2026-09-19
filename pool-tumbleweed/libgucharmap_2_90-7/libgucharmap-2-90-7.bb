SUMMARY = "A Featureful Unicode Character Map -- Library"
DESCRIPTION = "Gucharmap is a featureful unicode character map. \
 \
This package contains a library to use the character map."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "17.0.2"

RPM_NAME = "libgucharmap_2_90-7-17.0.2-1.4.aarch64.rpm"
RPM_HASH = "fa8865cc66b47f749bb9ca1eba60e5f3a62ef5a989fff25ac858fccb733815ea4e2ac2273d3394fc39fcaa8ed9d8173f3fa160f5a9b4641e31886476f5b681e7"

RPROVIDES:${PN} += "libgucharmap-2-90-7 \
libgucharmap-2-90.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpcre2-8.so.0"

inherit rpm
