SUMMARY = "PolicyKit Library Qt Bindings"
DESCRIPTION = "Polkit-qt aims to make it easy for Qt developers to take advantage of \
PolicyKit API. It is a convenience wrapper around QAction and \
QAbstractButton that lets you integrate those two components easily \
with PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.201.1"

RPM_NAME = "libpolkit-qt6-1-devel-0.201.1-1.3.aarch64.rpm"
RPM_HASH = "8fde1b7ea61c3b7f507fe2fd3340c7c6997877c0c28db48b8b153878470ebd7d860fe568eb791bbbad98be23624987ba26e0c436b25b4820b65c21490688029a"

RPROVIDES:${PN} += "cmake-PolkitQt6-1 \
libpolkit-qt6-1-devel \
pkgconfig-polkit-qt6-1 \
pkgconfig-polkit-qt6-agent-1 \
pkgconfig-polkit-qt6-core-1 \
pkgconfig-polkit-qt6-gui-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolkit-qt6-1-1 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-polkit-qt6-agent-1 \
pkgconfig-polkit-qt6-core-1 \
pkgconfig-polkit-qt6-gui-1 \
polkit-devel"

inherit rpm
