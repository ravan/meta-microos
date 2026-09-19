SUMMARY = "Introspection bindings for PackageKit's GLib integration"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less. \
 \
This package provides the GObject Introspection bindings for the \
PackageKit client library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.6"

RPM_NAME = "typelib-1_0-PackageKitGlib-1_0-1.3.6-2.1.aarch64.rpm"
RPM_HASH = "94b365ade4c00fea91c5a20a1062c958b0febb50608e950f76a95c1039dfff4bbe3280f7f00b680d1cf437df294521443b3412628d88e66fb5f24f69f93989ec"

RPROVIDES:${PN} += "typelib-1-0-PackageKitGlib-1-0 \
typelib-PackageKitGlib"

RDEPENDS:${PN} += "libpackagekit-glib2.so.18 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
