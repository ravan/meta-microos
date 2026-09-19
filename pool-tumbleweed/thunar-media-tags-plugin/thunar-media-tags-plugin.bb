SUMMARY = "Thunar Plugin for Editing Media File Metadata and Renaming Based on Metadata"
DESCRIPTION = "The Thunar Media Tags Plugin enables editing media file metadata from within \
the Thunar file properties dialog and allows for bulk renaming based on \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "thunar-media-tags-plugin-0.6.0-1.5.aarch64.rpm"
RPM_HASH = "2468205e3f5b24daa9687a567cb9f432734b7ba7fbb52d2ffaec8e0c9c9a23b5ef67d41c00b1a982b7de8bf5be4fbe25fc8cf96f8957b670f7fb11e8c8ba4e24"

RPROVIDES:${PN} += "thunar-media-tags-plugin \
thunar-plugin-media-tags"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libtag-c.so.2 \
libthunarx-3.so.0 \
thunar"

inherit rpm
