SUMMARY = "Shared library for feedbackd"
DESCRIPTION = "feedbackd provides a DBus daemon (feedbackd) to act on events to provide \
haptic, visual and audio feedback. It offers a library (libfeedback) and \
GObject introspection bindings to ease using it from applications. \
 \
This package contains the shared library for feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.8.9"

RPM_NAME = "libfeedback-0_0-0-0.8.9-1.3.aarch64.rpm"
RPM_HASH = "7bd0f2bbb8f1b3f4fe6e8699c8de9d4ce24d0487a7c70818c55e3aee2507af998a31d9a320c9ca0563bf4b0c72398aaca8457ecbe02b72dab019a3b4bdb72e8f"

RPROVIDES:${PN} += "libfeedback-0-0-0 \
libfeedback-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
