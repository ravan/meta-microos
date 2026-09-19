SUMMARY = "Console widget toolkit"
DESCRIPTION = "FINAL CUT is a class library and widget toolkit with full mouse \
support for creating a text-based user interface. The library supports \
the programmer to develop an application for the text console. It allows \
the simultaneous handling of multiple windows on the screen. \
The C++ class design was inspired by the Qt framework. It provides \
common controls like dialog windows, push buttons, check boxes, \
radio buttons, input lines, list boxes, status bars and so on."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "libfinal0-0.9.1-1.10.aarch64.rpm"
RPM_HASH = "71ded092a3bd61eb4bdf4d35630d66bfac7df3521b22555e56cfd782ce51c5c0de2c8448d0a89fddc0bf02333db2b00f65da0fdf7323b59f7ca0138054d82b8b"

RPROVIDES:${PN} += "libfinal.so.0 \
libfinal0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgpm.so.2 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
