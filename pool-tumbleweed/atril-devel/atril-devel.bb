SUMMARY = "MATE Desktop document viewer development files"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "atril-devel-1.28.4-1.2.aarch64.rpm"
RPM_HASH = "05fa0b2c64dd14f5da6735128c11b0951a05bb7961f6606cc2f866d84036a0b44f815eb86835f0ed186d52698d3f736eea16b8e06e63eb52ea2015caf4b79ba7"

RPROVIDES:${PN} += "atril-devel \
mate-document-viewer-devel \
pkgconfig-atril-document-1.5.0 \
pkgconfig-atril-view-1.5.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
atril-backends \
pkgconfig-gio-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-AtrilDocument-1-5-0 \
typelib-1-0-AtrilView-1-5-0"

inherit rpm
