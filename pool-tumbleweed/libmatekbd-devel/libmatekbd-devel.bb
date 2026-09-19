SUMMARY = "MATE Desktop keyboard configuration development files"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "libmatekbd-devel-1.28.0-2.5.aarch64.rpm"
RPM_HASH = "524d0e2b69a8be1f9486eaa20b7acec1ca9181c1a43065617d7b4b16087f98ae3743146c466bd263e24bbf9a6e1811ee0bc4478f0a59361da5963297fce79a55"

RPROVIDES:${PN} += "libmatekbd-devel \
pkgconfig-libmatekbd \
pkgconfig-libmatekbdui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmatekbd6 \
libmatekbdui6 \
matekbd-common \
pkgconfig-gdk-3.0 \
pkgconfig-gio-2.0 \
pkgconfig-gmodule-export-2.0 \
pkgconfig-libxklavier"

inherit rpm
