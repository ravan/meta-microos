SUMMARY = "Shared development files for GObject's Python bindings"
DESCRIPTION = "This package contains common files required to build wrappers for gobject \
addon libraries such as pygtk in both Python2 and Python3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.56.3"

RPM_NAME = "python-gobject-common-devel-3.56.3-1.3.aarch64.rpm"
RPM_HASH = "63c70404cb9080e5a0b184be387664796219d501768fd3debadf98d9d9bff8b9daa96247ecdb032ed2167433cef354b9816865128f31028e56084577f041f338"

RPROVIDES:${PN} += "pkgconfig-pygobject-3.0 \
python-gobject-common-devel \
python313-gobject-common-devel \
python314-gobject-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
gobject-introspection-devel \
libffi-devel \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-gobject-2.0 \
pkgconfig-libffi"

inherit rpm
