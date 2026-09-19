SUMMARY = "Brasero media utility function library"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This subpackage contains a library of Brasero with utility functions \
related to disc image creation and extraction, and drive handling."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3+43"

RPM_NAME = "libbrasero-media3-1-3.12.3+43-3.3.aarch64.rpm"
RPM_HASH = "96f0034475885c201f5a2ed24e911cf6f7b65d129babed57a7aa949236df0f0d9784f61afcf057de9b5c6802fcfac8bdfa9a1ef0d24bcb7e3f32df719663f5f1"

RPROVIDES:${PN} += "libbrasero-media3-1 \
libbrasero-media3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
