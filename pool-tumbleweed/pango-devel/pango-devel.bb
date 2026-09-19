SUMMARY = "Development files for pango, a library for text layout and rendering"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.58.2"

RPM_NAME = "pango-devel-1.58.2-1.1.aarch64.rpm"
RPM_HASH = "4644d28e9d16737df2c4a9963f988425b23202e5a8852cf31be536acace76a27941b97aa90c2f7337168ae1e4cfd4560352d4ec34cb7bdef048e1ba7c38844e8"

RPROVIDES:${PN} += "pango-devel \
pango-doc \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-pangofc \
pkgconfig-pangoft2 \
pkgconfig-pangoot \
pkgconfig-pangoxft \
rpm-macro-pango-module-post \
rpm-macro-pango-module-postun \
rpm-macro-pango-module-requires"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpango-1-0-0 \
pkgconfig-cairo \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-harfbuzz \
pkgconfig-harfbuzz-gobject \
pkgconfig-libthai \
pkgconfig-pango \
pkgconfig-pangoft2 \
pkgconfig-xft \
pkgconfig-xrender \
typelib-1-0-Pango-1-0"

inherit rpm
