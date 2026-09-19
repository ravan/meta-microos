SUMMARY = "A simple and useful image compressor"
DESCRIPTION = "Curtail (previously ImCompressor) is an useful image compressor, supporting \
PNG, JPEG and WEBP file types. It support both lossless and lossy compression \
modes with an option to whether keep or not metadata of images."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.1"

RPM_NAME = "curtail-1.16.1-1.2.noarch.rpm"
RPM_HASH = "010ebe46c1f7ba6d22c46f19e9cd1489bc55c3297bc769e0f18d1fa008fd708e9c5f23ac839774c20affa56ead727158abf42ccf32a4f140d1af9b45a21afa80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "curtail"

RDEPENDS:${PN} += "/usr/bin/python3 \
jpegoptim \
libwebp-tools \
oxipng \
pngquant \
python3-gobject-Gdk \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk"

inherit rpm
