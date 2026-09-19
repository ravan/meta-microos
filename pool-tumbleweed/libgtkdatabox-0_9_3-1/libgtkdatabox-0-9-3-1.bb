SUMMARY = "GTK+ widget for fast data display"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-2 library designed to display large \
amounts of numerical data fast and easy."
LICENSE = "LGPL-2.1+"

PV = "0.9.3.1"

RPM_NAME = "libgtkdatabox-0_9_3-1-0.9.3.1-1.18.aarch64.rpm"
RPM_HASH = "022afe84762acfc70ec6364fec1c07338404d43a26b4b92eeabd598d16b6e1413d0fd1d9ba695cf9a3baf94c48be2cbcdf6fe24a9d232285b97c43f3faf6c008"

RPROVIDES:${PN} += "libgtkdatabox \
libgtkdatabox-0-9-3-1 \
libgtkdatabox-0.9.3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
