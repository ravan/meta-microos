SUMMARY = "On-screen Keyboard for GNOME -- GTK+ 2 Module"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-gtk2-module-0.4.21-10.7.aarch64.rpm"
RPM_HASH = "87510aee1441aef380fd43a60cc4764e69936f4f213b9fe69cbf8798e10d69e9329d0c4adae3d3c406cd9697227639925309b6b87346f6771fe5daac7cd86ce5"

RPROVIDES:${PN} += "caribou-gtk2-module \
libcaribou-gtk-module.so"

RDEPENDS:${PN} += "caribou \
caribou-gtk-module-common \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
