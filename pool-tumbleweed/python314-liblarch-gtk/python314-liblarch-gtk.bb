SUMMARY = "GTK bindings for liblarch"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents) \
 \
This package provides GTK bindings for liblarch."
LICENSE = "LGPL-3.0-or-later"

PV = "3.2.0"

RPM_NAME = "python314-liblarch-gtk-3.2.0-2.10.noarch.rpm"
RPM_HASH = "91a7f192b40d91c0b8c1468735860e6daa2fc6966df1e2cb60ab4bc02234170939160d8ce33347987de40a721486861a7c2c75e344791b636dbeeae09b9789be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-liblarch-gtk"

RDEPENDS:${PN} += "python-abi \
python314-gobject \
python314-liblarch \
typelib-Gtk"

inherit rpm
