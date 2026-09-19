SUMMARY = "A customizable notification daemon"
DESCRIPTION = "Dunst is a customizable replacement for the notification daemons \
provided by most desktop environments."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "dunst-1.13.2-1.3.aarch64.rpm"
RPM_HASH = "aa7f43789f716cbf0073e206f332f8e04722b008b8899b776b6e7f0e08906b786c49298d1b24c17ea5056a7bd244db812e4e207b69dcf755f0e213808ecc27ca"

RPROVIDES:${PN} += "config-dunst \
dunst"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
