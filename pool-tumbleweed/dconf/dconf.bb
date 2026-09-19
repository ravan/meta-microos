SUMMARY = "Key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.49.0"

RPM_NAME = "dconf-0.49.0-1.5.aarch64.rpm"
RPM_HASH = "57e59f2b47feae57b500b17bfda1399edc47fabdd8ea331035f2f735c4f1ca2a9b09fd68539f6de89f86eff1d78b267d24ca15fd3b10458b0be7aaa8eca782af"

RPROVIDES:${PN} += "dconf"

RDEPENDS:${PN} += "dbus-service \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdconf.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
