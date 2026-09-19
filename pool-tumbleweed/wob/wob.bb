SUMMARY = "A lightweight overlay volume/backlight/progress/anything bar for Wayland"
DESCRIPTION = "A lightweight overlay volume/backlight/progress/anything bar for Wayland"
LICENSE = "ISC"

PV = "0.16"

RPM_NAME = "wob-0.16-1.6.aarch64.rpm"
RPM_HASH = "3eabf73396598f3899e5cdd2daa5c858726756ad40ac44b0db46495b421edf1d9f7c9a2cf9668aa34d5838a9b58cac5df6d8212310fa324c8ef5c0b6dc88cd82"

RPROVIDES:${PN} += "wob"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libinih.so.0 \
libm.so.6 \
libseccomp.so.2 \
libwayland-client.so.0"

inherit rpm
