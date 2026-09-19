SUMMARY = "Mobile Broadband Interface Model (MBIM) protocol"
DESCRIPTION = "libmbim is a glib-based library for talking to WWAN modems and devices \
which speak the Mobile Broadband Interface Model (MBIM) protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "1.34.0"

RPM_NAME = "libmbim-glib4-1.34.0-1.4.aarch64.rpm"
RPM_HASH = "b554ed620e1bec9833fddd706bba57b1f7161ba16269c352560586be62e9c0000e79488aa0a3ff55da5b725615328c984370a819ae2026f17985a02ad7c9aa88"

RPROVIDES:${PN} += "libmbim-glib.so.4 \
libmbim-glib4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
