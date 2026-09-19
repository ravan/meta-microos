SUMMARY = "Developer's Help Program for GNOME"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "devhelp-43.0-3.7.aarch64.rpm"
RPM_HASH = "3d93e001e8ea581dbeb39355251384a1d65db96b42c112f94e0342dd27c517adf494eb4a288a4dc0e93268674f818da2af4912c80e5ad4658316257aadfec9b4"

RPROVIDES:${PN} += "devhelp \
libdevhelp-3.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libwebkit2gtk-4.1.so.0"

inherit rpm
