SUMMARY = "Modular Desktop Settings Hub"
DESCRIPTION = "This package contains the shared library required to run the plugs."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0.3"

RPM_NAME = "libswitchboard-3-0-8.0.3-1.5.aarch64.rpm"
RPM_HASH = "c89d65569f5ab60cb359f3bad1081d592bf37af5d6f9c26ffafef1b5137dad8145f04459b80bc420a690b302a8c187a479f675c03d50a5402008b13f18785912"

RPROVIDES:${PN} += "libswitchboard-3-0 \
libswitchboard-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
