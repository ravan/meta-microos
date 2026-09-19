SUMMARY = "Backend gdkpixbuf for pqiv"
DESCRIPTION = "Backend gdkpixbuf for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.13.3"

RPM_NAME = "pqiv-gdkpixbuf-2.13.3-1.4.aarch64.rpm"
RPM_HASH = "c82725859e85c160ce6135e00b7a67bf2719dda8354a2c877b0765b55933a77231e92fd67493b95f9ac33dcc6301bee09e87de7653d9b866713c41a2e2ab5e1f"

RPROVIDES:${PN} += "pqiv-gdkpixbuf"

RDEPENDS:${PN} += "libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
pqiv"

inherit rpm
