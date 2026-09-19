SUMMARY = "Documentation for the D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on library to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains developer documentation."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.114"

RPM_NAME = "dbus-1-glib-doc-0.114-1.3.noarch.rpm"
RPM_HASH = "ce54cda082363b53562cc00df31198d765bde4acdb0b93d2102221f3f6e7e59f8f1dd9339f3299e74494e7ae1c457066d0807641a47a527de30354f24576b6c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-1-glib-doc"

RDEPENDS:${PN} += ""

inherit rpm
