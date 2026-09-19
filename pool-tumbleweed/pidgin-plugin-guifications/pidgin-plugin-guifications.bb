SUMMARY = "Pidgin plugin to display 'toaster' popups"
DESCRIPTION = "Guifications is a Pidgin plugin that displays 'toaster' popups in a \
user-defined corner of the screen, similar to features to be seen \
in other common messenger clients. It's highly configurable, easy \
to use, and has theme support. It really is the end-all, be-all \
toaster pop-up plugin for Pidgin!"
LICENSE = "GPL-2.0+"

PV = "2.16"

RPM_NAME = "pidgin-plugin-guifications-2.16-10.37.aarch64.rpm"
RPM_HASH = "07dc9fded591f1725c6a0384690e87c23e8a5b0091d09bc8826f9c8f1e9821d55caabf0a187564c300c54467e06d68961cb9f16a1473f949cea7dfcfc33a5864"

RPROVIDES:${PN} += "pidgin-guifications \
pidgin-plugin-guifications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpurple.so.0 \
pidgin"

inherit rpm
