SUMMARY = "A module to control the request handling in lighttpd"
DESCRIPTION = "A module to control the request handling in lighttpd. \
 \
It is the successor of mod_cml."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_magnet-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "a75ff3eeaeac58eb36faf8e4c79d3a504d0ddf66e37b6c5216154161f2387040c3d528183253b5b4b7ae79ff3760e8577694c25eda176843816cb0177f14a232"

RPROVIDES:${PN} += "config-lighttpd-mod-magnet \
lighttpd-mod-magnet"

RDEPENDS:${PN} += "group-lighttpd \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libnettle.so.8 \
lighttpd"

inherit rpm
