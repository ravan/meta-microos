SUMMARY = "Mobile Broadband Interface Model (MBIM) protocol"
DESCRIPTION = "libmbim is a glib-based library for talking to WWAN modems and devices \
which speak the Mobile Broadband Interface Model (MBIM) protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.34.0"

RPM_NAME = "libmbim-1.34.0-1.4.aarch64.rpm"
RPM_HASH = "5ce29c513b7ffa4d76e461e4103d8f94bdbb4633a09df68599bfeb8f7529be356ceda7238294a0f79b9b03367ed16a2997af4d8d8b6c06c980c03b36a8e5b6f7"

RPROVIDES:${PN} += "libmbim"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmbim-glib.so.4"

inherit rpm
