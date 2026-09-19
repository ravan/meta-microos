SUMMARY = "Search tool and indexer using tinysparql"
DESCRIPTION = "LocalSearch is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
These are the sources for the search tool and indexer (e.g. files, rss)"
LICENSE = "GPL-2.0-or-later"

PV = "3.11.2"

RPM_NAME = "localsearch-3.11.2-1.1.aarch64.rpm"
RPM_HASH = "1cc8882b3e4594524384b0517e2c542ccd5911573ffa33a03d945bb6673bc5a2b37773563151003527fe6be30832db0fd035c0ca0c01d92272936efb8413f9ec"

RPROVIDES:${PN} += "libextract-abw.so \
libextract-bmp.so \
libextract-desktop.so \
libextract-disc-generic.so \
libextract-dummy.so \
libextract-epub.so \
libextract-gif.so \
libextract-html.so \
libextract-icon.so \
libextract-iso.so \
libextract-jpeg.so \
libextract-libav.so \
libextract-mp3.so \
libextract-msoffice-xml.so \
libextract-msoffice.so \
libextract-oasis.so \
libextract-pdf.so \
libextract-playlist.so \
libextract-png.so \
libextract-ps.so \
libextract-raw.so \
libextract-text.so \
libextract-tiff.so \
libextract-webp.so \
libextract-xps.so \
libtracker-extract-zip.so \
libtracker-extract.so \
libwriteback-gstreamer.so \
libwriteback-playlist.so \
libwriteback-xmp.so \
localsearch \
tracker-miners-files"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavformat.so.62 \
libc.so.6 \
libcue.so.2 \
libexempi.so.8 \
libgexiv2-0.16.so.4 \
libgif.so.7 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgupnp-dlna-2.0.so.4 \
libgxps.so.2 \
libicui18n.so.78 \
libjpeg.so.8 \
libm.so.6 \
libosinfo-1.0.so.0 \
libpng16.so.16 \
libpoppler-glib.so.8 \
libseccomp.so.2 \
libtiff.so.6 \
libtinysparql-3.0.so.0 \
libtotem-plparser.so.18 \
libupower-glib.so.3 \
libwebpdemux.so.2 \
libxml2.so.16 \
libzip.so.5 \
tinysparql \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Tracker"

inherit rpm
