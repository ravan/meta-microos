SUMMARY = "Policy engine and reporting tool for large filesystems"
DESCRIPTION = "The Robinhood Policy Engine is a tool to manage contents of large \
file systems. It maintains a replicate of filesystem medatada in a \
database that can be queried at will. It makes it possible to \
schedule mass action on filesystem entries by defining \
attribute-based policies, provides fast 'find' and 'du' enhanced \
clones, gives to administrators an overall view of filesystem \
contents through its web UI and command line tools. \
 \
It supports any POSIX filesystem and implements advanced features for \
Lustre filesystems (list/purge files per OST or pool, read MDT \
changelogs...)"
LICENSE = "CECILL-C"

PV = "3.2.0"

RPM_NAME = "robinhood-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "a320d940740d7764dc01601a1a758d979d212f84c8ff6bc7cd83c0ec11b37aa535b9c4049a92f81904c7a24fa825e090c9cb8ff56da27eaeb19faa9e305a973e"

RPROVIDES:${PN} += "librbh-mod-alerter.so \
librbh-mod-basic.so \
librbh-mod-checker.so \
librbh-mod-common.so \
librbh-mod-modeguard.so \
librbh-mod-test.so \
robinhood"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libjemalloc.so.2 \
libmariadb.so.3 \
libz.so.1 \
systemd \
which"

inherit rpm
