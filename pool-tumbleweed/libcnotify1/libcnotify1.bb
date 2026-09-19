SUMMARY = "Library for C notify functions"
DESCRIPTION = "A library for C notify functions."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcnotify1-20260703-1.2.aarch64.rpm"
RPM_HASH = "5827681e3fb8cdc299de10f21ad7f40b3ee21ca2418ca7270719e662c8dcf4210da5e3a411abf7349653594bcbdcbbf3a24e6e151d251039c94379f47cd01f99"

RPROVIDES:${PN} += "libcnotify.so.1 \
libcnotify1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
