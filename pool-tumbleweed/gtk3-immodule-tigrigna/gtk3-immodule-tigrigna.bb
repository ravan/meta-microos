SUMMARY = "Tigrigna input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides two input methods for Tigrigna."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-immodule-tigrigna-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "a34082a3779488e11028968609ec920b07d793ffd140690dfd1b4dff7cf4555e9799d583a84227fbccc81ff538af922c037c84886f65ccd63503be36981775eb"

RPROVIDES:${PN} += "gtk3-immodule-tigrigna \
gtk3-immodules-tigrigna \
locale-gtk3-ti"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
