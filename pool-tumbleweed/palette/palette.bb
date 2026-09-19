SUMMARY = "Color palette viewer"
DESCRIPTION = "A program for viewing and copying colors for the Pantheon Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "palette-4.0.0-2.9.aarch64.rpm"
RPM_HASH = "f334d6b32d8fc7f99a226da14dffabf98148b0a74060f08874a3486461792746583f5621d5c971082fb285f50c0c95f7b828305b02ffe50a65ae92a3383ce36b"

RPROVIDES:${PN} += "palette"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
