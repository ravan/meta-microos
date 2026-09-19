SUMMARY = "A markup language for GTK user interfaces"
DESCRIPTION = "A markup language for GTK user interface files."
LICENSE = "LGPL-3.0-or-later"

PV = "0.22.2"

RPM_NAME = "blueprint-compiler-0.22.2-1.1.noarch.rpm"
RPM_HASH = "5d42d24f6b432bd0bba499824b32966293414aace8ccb3dc0772f121ecb8ce7c8214651eb7afc91f2167e59eb15a552c16dc7345d21f244a28d6dc7d5c73fb6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueprint-compiler"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject \
typelib-GIRepository \
typelib-GLib \
typelib-GObject"

inherit rpm
