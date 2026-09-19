SUMMARY = "Ofono support for calls"
DESCRIPTION = "Ofono support for calls. \
 \
This package is not recommended, only install if you are sure you \
want ofono support."
LICENSE = "GPL-3.0-only & MIT"

PV = "50.0"

RPM_NAME = "calls-ofono-50.0-1.2.aarch64.rpm"
RPM_HASH = "94b73bf08c918760489eeb479813820fde0da3b74fdb6922de102b77022a4d9b5c73a8945492e8106c3af487014d48d36acfaf3e4b51e935ff5a9426140dc680"

RPROVIDES:${PN} += "calls-ofono \
libofono.so"

RDEPENDS:${PN} += "calls \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpeas-2.so.0"

inherit rpm
