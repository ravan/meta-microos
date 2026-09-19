SUMMARY = "Development files for Tepl, a text editor framework"
DESCRIPTION = "“Actions, Menus and Toolbars Kit” or just AMTK is a basic \
GtkUIManager replacement based on GAction, suitable for \
both a traditional UI or a modern UI with a GtkHeaderBar. \
 \
This package provides all the necessary files for development \
with AMTK."
LICENSE = "LGPL-3.0-or-later"

PV = "5.10.0"

RPM_NAME = "libgedit-amtk-devel-5.10.0-1.3.aarch64.rpm"
RPM_HASH = "752899dfeb1534ed218fb79b6822da5a04f61f70da65ede83e276b7db3480e43dbabd7a94c46ac5a96aa04a7e310e5c26983f35bfb737e9b26b13e65d88b77a9"

RPROVIDES:${PN} += "libgedit-amtk-devel \
pkgconfig-libgedit-amtk-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgedit-amtk-5-0 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Amtk-5"

inherit rpm
