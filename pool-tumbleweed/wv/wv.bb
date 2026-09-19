SUMMARY = "Tools for Importing Microsoft Word (tm) Documents"
DESCRIPTION = "WV is a program that can understand the Microsoft Word 8 binary file \
format (Office97). It currently converts Word into HTML, which can then \
be read with a web browser."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "wv-1.2.9-4.8.aarch64.rpm"
RPM_HASH = "c6036849802ef06a9101348b6ab70b2a9364f1a53e165c34a845bde895672eb2c233901d940b19b965007982410ec4a9c5454cc2c249596888801170ce3e3308"

RPROVIDES:${PN} += "wv"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libwv-1.2.so.4 \
w3m"

inherit rpm
