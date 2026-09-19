SUMMARY = "GObject-based Plugin Engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.1"

RPM_NAME = "libpeas-2-0-2.2.1-2.4.aarch64.rpm"
RPM_HASH = "63769ec926df6f0c8bf5e009be37a417122f8d0a531f2a17405b5841f8fb2147e3822dd47aba6efd4a570d656ec99e3377255eb202f671a5c60292d5d5c0ddc3"

RPROVIDES:${PN} += "libpeas-2-0 \
libpeas-2.so.0 \
libpeas2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
