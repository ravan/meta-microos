SUMMARY = "Graphical D-Bus Debugger"
DESCRIPTION = "D-Feet is a graphical D-Bus debugger.  D-Bus is an RPC library used on \
the Desktop.  D-Feet can be used to inspect D-Bus objects of running \
programs and invoke methods on those objects."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.16"

RPM_NAME = "d-feet-0.3.16-2.15.noarch.rpm"
RPM_HASH = "e23a053d35bfb58209d03243354613efebfd1e54a87731f85bdb45817fbeb790dbe6733783cba80d1ccd1a3424dd34cabd2aba0e3eec4dec3982e81b3a0534d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "d-feet"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Wnck"

inherit rpm
