SUMMARY = "Typing stubs for PyGObject"
DESCRIPTION = "This package provides typing stubs for python-gobject to (typically) allow IDEs \
to provide helpful completion guides and documentation about python-gobject \
related modules. \
 \
 \
 \
 \
This package provides PyGObject stubs for Gtk4."
LICENSE = "LGPL-2.1-only"

PV = "2.17.0"

RPM_NAME = "python314-gobject-stubs-2.17.0-1.3.noarch.rpm"
RPM_HASH = "713a0f62b66863c1ee10546488e86acc4eb23273bfcd817e7ca9e9aa5f2abc0d65f10d9a9a46d80a9be149dde7c7f28bf8624788a94476e3a1b4bb62ba103aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygobject-stubs \
python314-gobject-stubs \
python3dist-pygobject-stubs"

RDEPENDS:${PN} += "python314-base \
python314-gobject \
python314-gobject-Gdk \
python314-typing-extensions"

inherit rpm
