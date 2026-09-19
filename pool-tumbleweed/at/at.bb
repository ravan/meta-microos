SUMMARY = "A Job Manager"
DESCRIPTION = "This program allows you to run jobs at specified times."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "at-3.2.5-4.3.aarch64.rpm"
RPM_HASH = "16226c2ddfee7d043d87ce0f834fda156894a8bb69f48f7daab461d156a6eb841576c23cd5b7624aee06722cae1b3cf41b9fe654b782e1a017229ffb17805fc6"

RPROVIDES:${PN} += "at \
config-at \
group-at \
user-at"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-trusted \
ld-linux-aarch64.so.1 \
libHX.so.43 \
libc.so.6 \
libpam.so.0 \
libselinux.so.1 \
permissions \
sysuser-shadow"

inherit rpm
