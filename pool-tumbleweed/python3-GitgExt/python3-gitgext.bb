SUMMARY = "Git repository viewer -- Python bindings"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "50"

RPM_NAME = "python3-GitgExt-50-1.1.aarch64.rpm"
RPM_HASH = "1bff4e6cf5e729c9cc24ecfc09360a5c600253c4c60a4af5b0458cf340bd15c79c7eb4e65685d762c4e2644d1040db72d7790371c8e5c24b4dc5d909dc19ae57"

RPROVIDES:${PN} += "python3-GitgExt"

RDEPENDS:${PN} += "python-abi \
typelib-GObject"

inherit rpm
