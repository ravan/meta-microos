SUMMARY = "The lunar-calendar libraries"
DESCRIPTION = "This package contains the libraries for lunar-calendar."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "liblunar-calendar-3_0-1-3.0.1-1.13.aarch64.rpm"
RPM_HASH = "aa35de028ae290a395b2a26bc0de615aaa2042cead31874ac4f2eb1569e963feeb739cfdc7abd7baa91f3e1a599eaf95f7cfedf55e4df4a3b8207ada70269caa"

RPROVIDES:${PN} += "liblunar-calendar-3-0-1 \
liblunar-calendar-3.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblunar-date-3.0.so.1 \
libpango-1.0.so.0"

inherit rpm
