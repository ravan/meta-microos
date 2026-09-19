SUMMARY = "Typing stubs for PyGObject"
DESCRIPTION = "This package provides typing stubs for python-gobject to (typically) allow IDEs \
to provide helpful completion guides and documentation about python-gobject \
related modules. \
 \
 \
This package provides PyGObject stubs for Gtk3."
LICENSE = "LGPL-2.1-only"

PV = "2.17.0"

RPM_NAME = "python314-gobject-stubs-gtk3-2.17.0-1.3.noarch.rpm"
RPM_HASH = "b21e77e3a08835810dd4a19ea338f81136a15b76cf90edf4c8632d4efcc85454de7031998b39728320b33c4f8977f61a9e72cb178f06d3cb2814886d14340973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygobject-stubs \
python314-gobject-stubs-gtk3 \
python3dist-pygobject-stubs"

RDEPENDS:${PN} += "python314-base \
python314-gobject \
python314-gobject-Gdk \
python314-typing-extensions"

inherit rpm
