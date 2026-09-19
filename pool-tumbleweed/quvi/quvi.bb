SUMMARY = "Command line tool for parsing flash media stream URLs"
DESCRIPTION = "quvi is a command line tool for parsing flash media stream URLs. \
It supports many websites including YouTube and Dailymotion."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.5"

RPM_NAME = "quvi-0.9.5-5.23.aarch64.rpm"
RPM_HASH = "df05a3ac24f177be03be2ddd74316813fbf26cde9fdcf7c2163a37528a0670d33f2760a813bad19d07920346d3eec5748e9ab49f7a73db1d28ed3a0174ffa268"

RPROVIDES:${PN} += "quvi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libquvi-0.9-0.9.4.so \
libxml2.so.16"

inherit rpm
