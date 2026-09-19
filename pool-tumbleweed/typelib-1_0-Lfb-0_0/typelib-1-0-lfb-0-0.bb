SUMMARY = "Introspection bindings for feedbackd"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications. \
 \
This package contains the introspection bindings for feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.8.9"

RPM_NAME = "typelib-1_0-Lfb-0_0-0.8.9-1.3.aarch64.rpm"
RPM_HASH = "ab13deac44b2ddf9e54ca0335f32f977ebe20036a13f38d324fb38f68b0e6721b3dae1ada254a774889430ae63eb92f20f4a0e02ebffe2a9a204c13dafc21471"

RPROVIDES:${PN} += "typelib-1-0-Lfb-0-0 \
typelib-Lfb"

RDEPENDS:${PN} += "libfeedback-0.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
