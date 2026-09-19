SUMMARY = "LibCVC API -- Introspection bindings"
DESCRIPTION = "Utility library for volume control of pulseaudio from gobject-based \
Cinnamon modules/applications. \
 \
This package provides the GObject Introspection bindings for libcvc."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "typelib-1_0-Cvc-1_0-6.4.1-1.8.aarch64.rpm"
RPM_HASH = "1dd1c5d402dc97584344865675a9f9418ff1a3a607d39c569d40c0fc539fed42c0a8e11f5e698653c4e571aa3d071c6757374a405f8566bc4dd1c3032d8fbf48"

RPROVIDES:${PN} += "typelib-1-0-Cvc-1-0 \
typelib-Cvc"

RDEPENDS:${PN} += "libcvc.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
