SUMMARY = "Libyui - REST API plugin for the Ncurses frontend"
DESCRIPTION = "This package provides a libyui REST API plugin for the \
Ncurses frontend. \
 \
It allows inspecting and controlling the UI remotely via \
an HTTP REST API. This is designed for automated tests."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-ncurses-rest-api16-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "4dad564008e8fdee1e555bcd313068b00001c8d44040f354af63f6c5b0c97c1258ac75c893fa612aeb6ea5e758890506969d34e9981eded1a3c3f69d72739143"

RPROVIDES:${PN} += "libyui-ncurses-rest-api \
libyui-ncurses-rest-api.so.16 \
libyui-ncurses-rest-api16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyui-ncurses16 \
libyui-rest-api16 \
libyui.so.16 \
libyui16 \
yui-backend"

inherit rpm
