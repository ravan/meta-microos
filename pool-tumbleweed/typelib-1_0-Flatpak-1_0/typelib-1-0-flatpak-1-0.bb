SUMMARY = "Introspection bindings for the flatpak library"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.2"

RPM_NAME = "typelib-1_0-Flatpak-1_0-1.18.2-1.1.aarch64.rpm"
RPM_HASH = "5e75aa806e3790527780a1d640c43c40f69fb9344cc551b70e208606ac1e5f2d1f9cae43dd88fe591d4697fe2b8998d0b66001674a803234ebb92485bf77296e"

RPROVIDES:${PN} += "typelib-1-0-Flatpak-1-0 \
typelib-Flatpak"

RDEPENDS:${PN} += "libflatpak.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
