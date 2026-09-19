SUMMARY = "An Image Viewer and Browser for GNOME"
DESCRIPTION = "gThumb lets you browse your hard disk, showing you thumbnails of image \
files. It also lets you view single files (including GIF animations), \
add comments to images, organize images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.10"

RPM_NAME = "gthumb-3.12.10-2.6.aarch64.rpm"
RPM_HASH = "2d59e20286fc396dc071acc09f82d36c3c300b2d4488af2ed40cae64d1e170fc5b122b121f5dbf34099ece84ae8e9d1a71ad800700f17e8111485133c1176d27"

RPROVIDES:${PN} += "gthumb \
libbookmarks.so \
libburn-disc.so \
libcairo-io.so \
libcatalogs.so \
libchange-date.so \
libcomments.so \
libcontact-sheet.so \
libconvert-format.so \
libdesktop-background.so \
libedit-metadata.so \
libexiv2-tools.so \
libexport-tools.so \
libfile-manager.so \
libfile-tools.so \
libfile-viewer.so \
libfind-duplicates.so \
libgstreamer-tools.so \
libgstreamer-utils.so \
libimage-print.so \
libimage-rotation.so \
libimage-viewer.so \
libimporter.so \
libjpeg-utils.so \
liblist-tools.so \
libopen-map.so \
libphoto-importer.so \
libraw-files.so \
libred-eye-removal.so \
librename-series.so \
libresize-images.so \
libsearch.so \
libselections.so \
libslideshow.so \
libterminal.so \
libwebalbums.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libbrasero-burn3.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libcolord.so.2 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libheif.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libraw.so.25 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libz.so.1"

inherit rpm
