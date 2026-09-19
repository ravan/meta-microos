SUMMARY = "Typelib files for libosinfo"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.12.0"

RPM_NAME = "typelib-1_0-Libosinfo-1_0-1.12.0-3.6.aarch64.rpm"
RPM_HASH = "2e057a8073c44676290ea33e033cf63ab7b10a6be0d2a328e9a0e8d1f513e2818cc0a93f23e7808e2eece59001833ae9455b058256e5b83fa34b2193ebc49acf"

RPROVIDES:${PN} += "typelib-1-0-Libosinfo-1-0 \
typelib-Libosinfo"

RDEPENDS:${PN} += "libosinfo-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-libxml2"

inherit rpm
