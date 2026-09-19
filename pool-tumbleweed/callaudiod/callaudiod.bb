SUMMARY = "Daemon for audio calls"
DESCRIPTION = "A daemon for audio calls."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.99"

RPM_NAME = "callaudiod-0.1.99-2.1.aarch64.rpm"
RPM_HASH = "a817830b9935c9471fc502c7010f04e0488eeb522ad884f133580bd76c4aee77a94c8b527042254547465861696cb50deadea5ecc14a85a7a095d11c3d49bd7d"

RPROVIDES:${PN} += "callaudiod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libappstream.so.5 \
libc.so.6 \
libcallaudio-0.1.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
