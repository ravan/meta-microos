SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-tools-2.24.33-18.7.aarch64.rpm"
RPM_HASH = "0f145786065f5895cb3d49085447fbcaff6124675d0435d9dd697963c157ac82f3960399c3fb27be84b06f185980633a8dcbb947777620b456edce8fd44a8a53"

RPROVIDES:${PN} += "gtk2-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
