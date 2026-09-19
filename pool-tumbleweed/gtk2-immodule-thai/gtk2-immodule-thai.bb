SUMMARY = "Thai-Lao input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Thai-Lao."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-thai-2.24.33-18.7.aarch64.rpm"
RPM_HASH = "7a0f1d04c3ccb9ec67762e663c85bd88339fa5a7f9d2f653519839f6bcf3673b6334df6b9c64ce54db8ec608cd4a0e4c61a6bf290ec761dbae2926a379da6a99"

RPROVIDES:${PN} += "gtk2-immodule-thai \
locale-gtk2-lo \
locale-gtk2-th"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
