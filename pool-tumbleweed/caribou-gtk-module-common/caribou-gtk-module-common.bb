SUMMARY = "On-screen Keyboard for GNOME -- Common Files for GTK+ Modules"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device. \
 \
This package contains files common to both the GTK+ 2 and GTK+ 3 \
modules."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-gtk-module-common-0.4.21-10.7.aarch64.rpm"
RPM_HASH = "13bda0d0a1d12ce92c9c48917f68193a1c247584cdcf45a123bdbb43c327a8615cc8162f8ae0b462235c639f74377169b718911227edea6797cdd33cb3024400"

RPROVIDES:${PN} += "caribou-gtk-module-common"

RDEPENDS:${PN} += ""

inherit rpm
