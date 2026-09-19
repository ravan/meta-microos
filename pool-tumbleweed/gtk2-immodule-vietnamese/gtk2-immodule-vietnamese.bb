SUMMARY = "Vietnamese input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Vietnamese."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-vietnamese-2.24.33-18.7.aarch64.rpm"
RPM_HASH = "9a4fa00e635719fd7c738bef45183f16329a1a9589855b548fe4ba6b5d5acaad2c7149f591525a3d75091f8f8a98e199d0612d8f80fd971b64157542ceddd11f"

RPROVIDES:${PN} += "gtk2-immodule-vietnamese \
locale-gtk2-vi"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
