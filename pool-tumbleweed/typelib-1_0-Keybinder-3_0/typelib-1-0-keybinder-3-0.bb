SUMMARY = "Introspection bindings for Keybinder"
DESCRIPTION = "Library for registering global keyboard shortcuts. Keybinder \
works with GTK-based applications using the X Window System. \
 \
This package provides the GObject Introspection bindings for libkeybinder0."
LICENSE = "MIT & X11"

PV = "0.3.2"

RPM_NAME = "typelib-1_0-Keybinder-3_0-0.3.2-1.36.aarch64.rpm"
RPM_HASH = "0a397b6a766684ed2d2705bb40d67dd62cfe9a3bc1b9a0ba0749831aca0d370d7c97ff30e385f73326a11e71586cc5ce5239acadc2c6a5044ebd2f035561ad4c"

RPROVIDES:${PN} += "typelib-1-0-Keybinder-3-0 \
typelib-Keybinder"

RDEPENDS:${PN} += "libkeybinder-3.0.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
