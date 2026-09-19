SUMMARY = "Module for gtklock which adds user info to the lockscreen"
DESCRIPTION = "Adds a user image and user name to the lockscreen."
LICENSE = "GPL-3.0-only"

PV = "4.0.0"

RPM_NAME = "gtklock-userinfo-module-4.0.0-1.8.aarch64.rpm"
RPM_HASH = "ca6eed94729a96fb8fc87e70989c48b6bb372a039b4f309663acaaad376f9052b5bc22af912c7ebf6ff24cd9fa448a604b6d0eec0d3722595625a6486d9e2d30"

RPROVIDES:${PN} += "gtklock-userinfo-module"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaccountsservice.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
