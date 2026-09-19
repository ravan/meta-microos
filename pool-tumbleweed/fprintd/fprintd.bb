SUMMARY = "D-Bus service for Fingerprint reader access"
DESCRIPTION = "The fprint project provides a central system \
to support consumer fingerprint reader devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.94.5"

RPM_NAME = "fprintd-1.94.5-1.4.aarch64.rpm"
RPM_HASH = "8ce9722b5c9e15ce89e446c008fea077e4a371cda4a5c8522eb2c3c5f6a2430b4ad6b4125c11180d736644cd02dff5e1943e379186aacfbe4a9882fc47277aff"

RPROVIDES:${PN} += "config-fprintd \
fprintd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfprint-2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
systemd"

inherit rpm
