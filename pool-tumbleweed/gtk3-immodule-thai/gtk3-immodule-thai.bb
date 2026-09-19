SUMMARY = "Thai-Lao input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Thai-Lao."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-immodule-thai-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "f38ed0345d6b649eb311b7fae59097c11ba08a5066e50fbd40cd377ccb3fb812e67f14317a5ec0fc06025e806cc5d5804b45e3e0de7efaffbf655004be441fad"

RPROVIDES:${PN} += "gtk3-immodule-thai \
locale-gtk3-lo \
locale-gtk3-th"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
