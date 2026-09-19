SUMMARY = "System monitor for GNOME Shell"
DESCRIPTION = "This GNOME Shell extension displays system usage information in the top bar."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gnome-shell-extension-system-monitor-50.3-1.1.noarch.rpm"
RPM_HASH = "faa391e57c39e9ef889223c5d47dc9726d60fa0a036e23cd6d3eb7495c2301aa624d8481320ee9aff94a1c99cc790ffdd31560536f26621c64fd60af9224a595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-system-monitor"

RDEPENDS:${PN} += "typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-GTop \
typelib-Gio \
typelib-Pango \
typelib-Shell \
typelib-St"

inherit rpm
