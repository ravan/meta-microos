SUMMARY = "Spice daemon for the DAV channel"
DESCRIPTION = "The spice-webdavd package contains a daemon to proxy WebDAV request to \
the Spice virtio channel."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "spice-webdavd-3.0-3.13.aarch64.rpm"
RPM_HASH = "b0795e86ab0baf66a5cce2c8e2fdaf9e6e39db2c520fcd59b44e72b50846e859200be1b44b4c921ed7831348f3304495178e3c03b9b0a1d97b47c49fc902f2aa"

RPROVIDES:${PN} += "spice-webdavd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-gobject.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
systemd"

inherit rpm
