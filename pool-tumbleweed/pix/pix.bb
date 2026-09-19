SUMMARY = "Image viewer and browser utility"
DESCRIPTION = "pix lets you browse your hard disk, showing you thumbnails of \
image files. \
It also lets you view single files (including GIF animations), add \
comments to images, organise images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.7"

RPM_NAME = "pix-3.4.7-1.8.aarch64.rpm"
RPM_HASH = "3eb10a663bbfae2b0c872906753e20d32334e6375f8c33e5fbbdc24f3c2ab1db8b07530b68364911ad2d564d983232b9836aa46dc0e0990840caf181acf3183d"

RPROVIDES:${PN} += "libbookmarks.so \
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
libphoto-importer.so \
libraw-files.so \
libred-eye-removal.so \
librename-series.so \
libresize-images.so \
libsearch.so \
libselections.so \
libslideshow.so \
libterminal.so \
libwebalbums.so \
pix"

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
libxapp.so.1 \
libz.so.1"

inherit rpm
