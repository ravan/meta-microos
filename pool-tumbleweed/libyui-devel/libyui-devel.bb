SUMMARY = "Libyui header files and examples"
DESCRIPTION = " \
This package contains header files and examples for developing C++ \
applications based on libyui, the user interface engine that provides \
the abstraction from graphical user interfaces (Qt, Gtk) and text \
based user interfaces (ncurses)."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-devel-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "6b48761985183bacfa60986ad0467792dbe58452f9fa0c3540c60b376dd82e4b0d06828c9552ed3e6224712211351e9877b815544e951c6175614bad04d5648f"

RPROVIDES:${PN} += "libyui-devel \
pkgconfig-libyui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boost-devel \
glibc-devel \
libstdc++-devel \
libyui16"

inherit rpm
