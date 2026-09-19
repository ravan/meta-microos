SUMMARY = "Library to build screen lockers with GTK"
DESCRIPTION = "Library to use GTK 3 to build screen lockers using the secure ext-session-lock-v1 protocol."
LICENSE = "GPL-3.0 & MIT"

PV = "0.2.0"

RPM_NAME = "libgtk-session-lock0-0.2.0-1.10.aarch64.rpm"
RPM_HASH = "d2cea7df88c358ff2ee477e99da51a4b37e921a8bd03c0dc9e758e2d8ea283d1fa1fb09dc2d40e4f549a2ddf1fb4891e630a739306fba39925f7cd04ff21f5e9"

RPROVIDES:${PN} += "libgtk-session-lock.so.0 \
libgtk-session-lock0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwayland-client.so.0"

inherit rpm
