SUMMARY = "Pantheon Backend Portal"
DESCRIPTION = "A Pantheon backend implementation for xdg-desktop-portal. \
 \
This package provides D-Bus interfaces that are used by xdg-desktop-portal \
to implement portals."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "xdg-desktop-portal-pantheon-8.2.0-1.2.aarch64.rpm"
RPM_HASH = "d72097fc27470487001f6bad7d89a40cc88a1e3e1910defda705c2c970a7c18eb894c7a9f4886cbc1103b531be8524f85da69f92bc4053747149fdabcc740fd5"

RPROVIDES:${PN} += "xdg-desktop-portal-pantheon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libaccountsservice.so.0 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpantheon-wayland.so.1"

inherit rpm
