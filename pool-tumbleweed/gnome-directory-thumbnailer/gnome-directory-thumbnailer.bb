SUMMARY = "Directory Thumbnailer"
DESCRIPTION = "GNOME thumbnailer to generate thumbnails for directories."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.11+15"

RPM_NAME = "gnome-directory-thumbnailer-0.1.11+15-2.2.aarch64.rpm"
RPM_HASH = "a768be3b47c682f9718106084d30b3927e1f395ee75988df6c924a51ff5ad2446366a8fd430cc1677f1abcc4444b37aee9ba5e5b4b065abe8abefecb4795bc7f"

RPROVIDES:${PN} += "gnome-directory-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libz.so.1"

inherit rpm
