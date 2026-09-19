SUMMARY = "wlr-layer-shell integration for Qt 6 - development files"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "layer-shell-qt6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "558614d82de0a43ef42742ca9b600d856f26c4fb3e734f9d656dbcd94676b1b256be321ae0198e6c74ddd2b50ba2c8efd051b0ca3524ea3f25a7f99cdce16f60"

RPROVIDES:${PN} += "cmake-LayerShellQt \
layer-shell-qt6-devel"

RDEPENDS:${PN} += "libLayerShellQtInterface6"

inherit rpm
