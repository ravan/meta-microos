SUMMARY = "The Linux Thermal Daemon program from 01.org"
DESCRIPTION = "Thermald is a Linux daemon used to prevent the overheating of platforms. \
This daemon monitors temperature and applies compensation using available cooling methods."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.12.2.git+dd186d0"

RPM_NAME = "thermald-2.5.12.2.git+dd186d0-1.3.aarch64.rpm"
RPM_HASH = "1bc6e1184d3e39d182660de32b9bafcd1bc1e9fe62e9ed0df8e56d7433a34659bf2378ff9c27bd8e2e64d66d90680430c96fabdadc316da3aea4a9b94971b03d"

RPROVIDES:${PN} += "config-thermald \
thermald"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
libupower-glib.so.3 \
libxml2.so.16"

inherit rpm
