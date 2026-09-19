SUMMARY = "Development files for libgladeui"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgladeui."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "libgladeui-2-devel-3.40.0-4.11.aarch64.rpm"
RPM_HASH = "ea3dc0940d01cec5d80a2bd75914a64b83191fe86142653265cf498851dbbbec23bf304e71221273549fa41631e3aa011726d63dacdcca2ea59ba4c46a6d9eee"

RPROVIDES:${PN} += "libgladeui-2-devel \
pkgconfig-gladeui-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgladeui-2-13 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Gladeui-2-0"

inherit rpm
