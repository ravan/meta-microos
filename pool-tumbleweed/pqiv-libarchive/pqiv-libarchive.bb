SUMMARY = "Backend libarchive for pqiv"
DESCRIPTION = "Backend libarchive/libarchive_cbx for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.13.3"

RPM_NAME = "pqiv-libarchive-2.13.3-1.4.aarch64.rpm"
RPM_HASH = "96783c347ef72627fc006dfe615f2b59471228dfa9a986ec57a0b0bee461619f020ed464e1d4191efe7c7beae396f8006d6968db8ccf34b862b454f178ceaf13"

RPROVIDES:${PN} += "pqiv-libarchive"

RDEPENDS:${PN} += "libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
pqiv"

inherit rpm
