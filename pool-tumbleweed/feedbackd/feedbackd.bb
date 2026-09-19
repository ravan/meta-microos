SUMMARY = "Feedback library for GNOME"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.8.9"

RPM_NAME = "feedbackd-0.8.9-1.3.aarch64.rpm"
RPM_HASH = "df03ba27f35cdf963f7287239ce38730bf6bc70ca777acea98719cd8a708f036101d4a85f5680b81064f8dc3470e25ed7c21cf7e9fe2b8e130b35a93766b78a0"

RPROVIDES:${PN} += "feedbackd \
group-feedbackd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfeedback-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmobile.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
