SUMMARY = "Library for prompting for PGP keys"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui0-3.12.2-12.7.aarch64.rpm"
RPM_HASH = "adc835c53b090f78122d2a2a8719caafc57bb03318686123ab38254787705476fdeb321d2f3dd967d1d89197eb0dcd4d74b7e569eb8e48a3c4e7e1b72ab65229"

RPROVIDES:${PN} += "libcryptui \
libcryptui.so.0 \
libcryptui0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnome-keyring \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptui-data \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
