SUMMARY = "Qt 6 QuickVectorImage library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickVectorImage library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickvectorimage-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "60c6b89ec31a77eb39234af039a156a9c0c53928f1982c721b827ce6261146d292937e11ce5fde95f43f2a79efeedeeb2ef0c9358557508a47aec56aa168fdf7"

RPROVIDES:${PN} += "cmake-Qt6QuickVectorImage \
cmake-Qt6QuickVectorImageGeneratorPrivate \
cmake-Qt6QuickVectorImageHelpers \
cmake-Qt6QuickVectorImageHelpersPrivate \
cmake-Qt6QuickVectorImagePrivate \
pkgconfig-Qt6QuickVectorImage \
pkgconfig-Qt6QuickVectorImageHelpers \
qt6-quickvectorimage-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6QuickPrivate \
cmake-Qt6QuickShapesPrivate \
cmake-Qt6SvgPrivate \
libQt6QuickVectorImage6"

inherit rpm
