SUMMARY = "Notifications Library -- Tools"
DESCRIPTION = "D-BUS notifications library. \
 \
This package contains the notify-send tool to create notifications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.8"

RPM_NAME = "libnotify-tools-0.8.8-2.4.aarch64.rpm"
RPM_HASH = "20ca6f2e49c4f0994e524bf2635efe1e6a3b65586ed8295f6df8e2daae9c8c375bceffef6b5ae9f1f1551f7e73e8e8ab43e9fe1e72f61e6b3a76b8d724bb27a4"

RPROVIDES:${PN} += "libnotify \
libnotify-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4"

inherit rpm
