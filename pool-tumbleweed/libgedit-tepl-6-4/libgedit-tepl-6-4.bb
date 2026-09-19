SUMMARY = "A text editor framework"
DESCRIPTION = "Tepl (Text Editor Product Line) is a library that eases the \
development of GtkSourceView-based text editors and IDEs. It is a \
continuation / rename of Gtef"
LICENSE = "LGPL-3.0-or-later"

PV = "6.14.0"

RPM_NAME = "libgedit-tepl-6-4-6.14.0-2.5.aarch64.rpm"
RPM_HASH = "bfb8a4927109ab255a3d58cfcd3de7d1399720b11f8fe5071f8801afc8c0ac6ea9a2a05018bc0a5cd6a3fa7ef095cc34eb955e7fc59df1f9785cb7d1e2c7771f"

RPROVIDES:${PN} += "libgedit-tepl-6 \
libgedit-tepl-6-4 \
libgedit-tepl-6.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgedit-amtk-5.so.0 \
libgedit-gfls-1.so.0 \
libgedit-gtksourceview-300.so.5 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libpango-1.0.so.0"

inherit rpm
