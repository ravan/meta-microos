SUMMARY = "Introspection bindings for gdm"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the GObject Introspection bindings for \
communicating with the GDM greeter server."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "typelib-1_0-Gdm-1_0-50.3-1.1.aarch64.rpm"
RPM_HASH = "7dcd669f08c4a8aaab33fd7947ccd1cffb21772606c48ff14f28b167f58e90e1184904b82a13ca62df196430cc976bb9da47ae72711360ab508f22a1eb0aa292"

RPROVIDES:${PN} += "typelib-1-0-Gdm-1-0 \
typelib-Gdm"

RDEPENDS:${PN} += "libgdm.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
