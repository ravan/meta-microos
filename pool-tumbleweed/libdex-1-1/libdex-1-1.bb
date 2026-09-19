SUMMARY = "Shared library for libdex"
DESCRIPTION = "Dex is a library supporting 'Deferred Execution' with the explicit \
goal of integrating with GNOME and GTK-based applications. \
It provides primatives for supporting futures in a variety of ways \
with both read-only and writable views. Additionally, integration \
with existing asynchronous-based APIs is provided through the use \
of wrapper promises. \
'Fibers' are implemented which allows for writing synchronous \
looking code which calls asynchronous APIs from GIO underneath. \
 \
This package contains the shared library for libdex."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libdex-1-1-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "02af1c9c7fe7e758d7d24790508e04983523c5b468f39eb7b55e052bbc14ef41738dc9ce0dbff0d0aa1235084d0469949b22b54a3fd1644f0f9e1233ba92168d"

RPROVIDES:${PN} += "libdex-1-1 \
libdex-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liburing.so.2"

inherit rpm
