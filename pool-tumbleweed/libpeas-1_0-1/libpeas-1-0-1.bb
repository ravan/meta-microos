SUMMARY = "GObject-based Plugin Engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "1.38.1"

RPM_NAME = "libpeas-1_0-1-1.38.1-1.3.aarch64.rpm"
RPM_HASH = "08a078d7ccc94bba2b1ac010a1dc2c82f1f52c4706d9a61d269b130e6db9514b17c0697c9d50b693e66428566f4182104f69c31b762b307377c0d25b0b9a1b0f"

RPROVIDES:${PN} += "libpeas \
libpeas-1-0-1 \
libpeas-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
