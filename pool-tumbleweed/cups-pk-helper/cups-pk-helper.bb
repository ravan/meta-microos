SUMMARY = "PolicyKit helper to configure cups with fine-grained privileges"
DESCRIPTION = "This package provides a PolicyKit helper to configure cups with \
fine-grained privileges. For example, it's possible to let users \
enable/disable printers without requiring a password, while still \
requiring a password for editing printer settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.7"

RPM_NAME = "cups-pk-helper-0.2.7-1.14.aarch64.rpm"
RPM_HASH = "7aea27f74666a051c0ebbe9d52e2d5cd3f89ea03157fd2cba240b9f303faba0e6c08e6dbf61aec976547af7c86cc436b9964bcae0afe09d59899b29a420ca815"

RPROVIDES:${PN} += "cups-pk-helper"

RDEPENDS:${PN} += "cups \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
