SUMMARY = "Papers document support for nautilus"
DESCRIPTION = "A extension for support document on nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "nautilus-extension-papers-50.3-1.1.aarch64.rpm"
RPM_HASH = "e3842c7f5ec1771a96f8cf1a0e9e9ce815474b742793e209c4e4ad2db140d3a646b7a1d9f2b36a4f7e209698a049f0aa405fbc0796cf28d647989e95441008a8"

RPROVIDES:${PN} += "libpapers-document-properties.so \
nautilus-extension-papers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
libppsdocument-4.0.so.6 \
papers"

inherit rpm
