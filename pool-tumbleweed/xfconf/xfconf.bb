SUMMARY = "Simple Configuration Storage for Xfce"
DESCRIPTION = "Xfconf is a simple client-server configuration storage and query system for the \
Xfce desktop."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "xfconf-4.20.0-1.9.aarch64.rpm"
RPM_HASH = "b02ceb5a9aa0529ff93b8f620fc3b9da1d1bb0b5362aa8978642383f88ef25e6d08230540f3c1dd345d9ca705339085a73cfcac8aaa1dfa6462701bc422bc5f2"

RPROVIDES:${PN} += "xfconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
