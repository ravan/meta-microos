SUMMARY = "Client Library for Communicating with GDM Greeter Server"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "libgdm1-50.3-1.1.aarch64.rpm"
RPM_HASH = "04beb9462bf8d69fdf1f9f76b8a184944792c605734f7d16254a069c81dfef4e886dbb3734d6e6d87258ce138c24c4bab9dd99fbc9c857f28716ad61c5259b96"

RPROVIDES:${PN} += "libgdm.so.1 \
libgdm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
gdm-schema \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
