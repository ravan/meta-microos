SUMMARY = "Header files for the Papers Document Viewer"
DESCRIPTION = "Papers is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript. \
 \
This package contains the header files for building additional plugins."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "papers-devel-50.3-1.1.aarch64.rpm"
RPM_HASH = "077ccfd03481a6c580ca432c8237dc88680ad81f27756470829ef14a849e45ac608a1c3ba2046a03c0483bceaaf7bb2312413b319d3689ea0858d3c6e253b72e"

RPROVIDES:${PN} += "papers-devel \
pkgconfig-papers-document-4.0 \
pkgconfig-papers-view-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
papers \
pkgconfig-gio-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1 \
typelib-1-0-PapersDocument-4-0 \
typelib-1-0-PapersView-4-0"

inherit rpm
