SUMMARY = "Development files for libinsane-gobject"
DESCRIPTION = "Development libraries and header files for libinsane-gobject. \
It also includes the vala bindings."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libinsane_gobject-devel-1.0.10-1.14.aarch64.rpm"
RPM_HASH = "efd8e445fd1879ccc58baac0820ebc985182450f1d72e76c0ca61e757f1f171cef890038040e33abe96ca16af5998e439ca4193d7fd049dbf430c33e20254cd9"

RPROVIDES:${PN} += "libinsane-gobject-devel"

RDEPENDS:${PN} += "libinsane-devel \
libinsane-gobject1 \
typelib-1-0-Libinsane-1-0"

inherit rpm
