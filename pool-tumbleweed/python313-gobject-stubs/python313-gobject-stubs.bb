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

RPM_NAME = "python313-gobject-stubs-2.17.0-1.3.noarch.rpm"
RPM_HASH = "e61baaf82a9c7cb7197e826e07c263e6cbe099b91a3f772737db93df69b72d293c830d6ba064de1e653296b4c3ba8197c5e12ed4842c151f90c96010950139c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gobject-stubs \
python3.13dist-pygobject-stubs \
python313-gobject-stubs \
python3dist-pygobject-stubs"

RDEPENDS:${PN} += "python313-base \
python313-gobject \
python313-gobject-Gdk \
python313-typing-extensions"

inherit rpm
