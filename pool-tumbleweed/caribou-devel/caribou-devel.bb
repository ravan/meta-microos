SUMMARY = "On-screen Keyboard for GNOME -- Development Files"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-devel-0.4.21-10.7.aarch64.rpm"
RPM_HASH = "79410a01624ac1395166a77a06631b723989ee87e2e1ff25a63c40382fa7aa5843646c3b3062e500426b06f950360300fef68e3fe0e4dbe28f704fecde86006f"

RPROVIDES:${PN} += "caribou-devel \
pkgconfig-caribou-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcaribou0 \
pkgconfig-gdk-x11-3.0 \
pkgconfig-gee-0.8 \
pkgconfig-libxklavier \
pkgconfig-libxml-2.0 \
pkgconfig-xtst \
typelib-1-0-Caribou-1-0"

inherit rpm
