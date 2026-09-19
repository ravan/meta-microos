SUMMARY = "Ruby bindings for libyui"
DESCRIPTION = "This package provides Ruby language bindings to access functions of \
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

RPM_NAME = "ruby-yui-4.7.7-1.3.aarch64.rpm"
RPM_HASH = "9b1ed4afa4479b687be378f04bd3ed94ed7c5226d3fc6fcf6b85d60e7fd5d71848989413b3c568ece6e19153dbf745f483433f0b350079c20ecf7e461031c8b2"

RPROVIDES:${PN} += "ruby-yui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby4.0.so.4.0 \
libstdc++.so.6 \
libyui.so.16"

inherit rpm
