SUMMARY = "Lightweight C library That Eases the Writing of UNIX Daemons"
DESCRIPTION = "libdaemon is a lightweight C library that eases the writing of UNIX \
daemons."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14"

RPM_NAME = "libdaemon0-0.14-19.17.aarch64.rpm"
RPM_HASH = "3fec1f076c0fa402ede2ffb20aebadd30b860ab097aca14b2dcf0f1cb841827515fb7003564dd7d7aa4e67ee817c3f538585294d4d740bd41e8c5f5309aac3f0"

RPROVIDES:${PN} += "libdaemon \
libdaemon.so.0 \
libdaemon0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
