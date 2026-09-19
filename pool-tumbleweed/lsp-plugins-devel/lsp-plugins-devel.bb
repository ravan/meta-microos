SUMMARY = "Linux Studio Plugins Development files"
DESCRIPTION = " \
Development files for Linux Studio Plugins"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.34"

RPM_NAME = "lsp-plugins-devel-1.2.34-1.1.aarch64.rpm"
RPM_HASH = "f5648fa9bf0488e32717cdb49a19f7ffd1e7a84b745c45afb2cc506b4e69181a3a968e23cc7efec2346ffbeeed25e9a4a5e5f7f09b40ce87f09396325b1253c7"

RPROVIDES:${PN} += "lsp-plugins-devel \
pkgconfig-lsp-audio-jack-lib \
pkgconfig-lsp-r3d-glx-lib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lsp-plugins-common"

inherit rpm
