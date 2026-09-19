SUMMARY = "Typing stubs for PyGObject"
DESCRIPTION = "This package provides typing stubs for python-gobject to (typically) allow IDEs \
to provide helpful completion guides and documentation about python-gobject \
related modules. \
 \
 \
This package provides PyGObject stubs for Gtk3."
LICENSE = "LGPL-2.1-only"

PV = "2.17.0"

RPM_NAME = "python313-gobject-stubs-gtk3-2.17.0-1.3.noarch.rpm"
RPM_HASH = "fb33db9f7290ef4b05f6197b45ffa6b5367e6136e42ff5bae0ad97aa75f4545baeba2a7bf11530652340f1c1b980266cc9c57ca1456c2fc43956607700c35690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gobject-stubs-gtk3 \
python3.13dist-pygobject-stubs \
python313-gobject-stubs-gtk3 \
python3dist-pygobject-stubs"

RDEPENDS:${PN} += "python313-base \
python313-gobject \
python313-gobject-Gdk \
python313-typing-extensions"

inherit rpm
