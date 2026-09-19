SUMMARY = "Tools from libxfce4ui"
DESCRIPTION = "This package provides tools from libxfce4ui."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "libxfce4ui-tools-4.20.2-1.5.aarch64.rpm"
RPM_HASH = "68440ee360438666dd6cafeeaac0a22f25d111acf84667520123427d2e487d3276463b08771641df85fe56be9ec14279c24de1bb5369e0296aa0b58972c3de14"

RPROVIDES:${PN} += "libxfce4ui-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libgudev-1.0.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
