SUMMARY = "Obex DBus API"
DESCRIPTION = "Obex-Data-Server provides a obex dbus api. Used for bluetooth \
applications to transfer and receive data."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.6"

RPM_NAME = "obex-data-server-0.4.6-16.9.aarch64.rpm"
RPM_HASH = "1bcd35b5d960eed52b6db9739304b9d40c354d6da8d4404a339d6aa0a56e844214d1b097ff4aa0774c0c99bca20104155454abb4278b18cd25e89c33003bb620"

RPROVIDES:${PN} += "config-obex-data-server \
obex-data-server"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libopenobex.so.2 \
libusb-0.1.so.4"

inherit rpm
