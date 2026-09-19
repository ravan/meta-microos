SUMMARY = "Python 3 bindings for libyui"
DESCRIPTION = "This package provides Python 3 language bindings to access functions of \
libyui - An User Interface engine that provides the \
abstraction from graphical user interfaces (Qt, Gtk) and text based \
user interfaces (ncurses). \
 \
Authors: \
--------- \
-    kkaempf@suse.de \
-    dmacvicar@suse.de"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "python3-yui-4.7.7-1.3.aarch64.rpm"
RPM_HASH = "e23d4eca3306e43e01d8e012621878e8a59a44a7d0376b67aa3eec6551e2d61e3bf864bea31d82a6389dcbd2c94766af47e2ae9c7a3b816c604383af63a61289"

RPROVIDES:${PN} += "python3-yui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libyui.so.16 \
python-abi"

inherit rpm
