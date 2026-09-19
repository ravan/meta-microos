SUMMARY = "Libyui - GUI abstraction library"
DESCRIPTION = "This is the user interface engine that provides the abstraction from \
graphical user interfaces (Qt, Gtk) and text based user interfaces \
(ncurses). \
 \
Originally developed for YaST, it can also be used independently of \
YaST for generic (C++) applications. This package has very few \
dependencies."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui16-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "c1900e49386b2b9be252937962a48b7cb05c78e89c64bf2f9529fde05f5a1bca1b61381ecd4f57dc7c00ab2583999abf52be1f9c4b6fdfc0a1adb59e5c3cc0ee"

RPROVIDES:${PN} += "libyui-doc \
libyui.so.16 \
libyui16 \
yast2-libyui"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
yui-backend"

inherit rpm
