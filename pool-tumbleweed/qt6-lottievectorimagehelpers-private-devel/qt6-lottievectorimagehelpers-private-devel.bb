SUMMARY = "Qt 6 LottieVectorImageHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 LottieVectorImageHelpers private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-lottievectorimagehelpers-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4c4b828cbf44e1226d64eccd7e3bb09863ae261ff9c39e8210efc6fd628f71fadab2f7dad0cd19afa368db40d61dec1be414ec83ea2d2897bb6474a266542f32"

RPROVIDES:${PN} += "cmake-Qt6LottieVectorImageHelpers \
cmake-Qt6LottieVectorImageHelpersPrivate \
pkgconfig-Qt6LottieVectorImageHelpers \
qt6-lottievectorimagehelpers-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Lottie \
libQt6LottieVectorImageHelpers6"

inherit rpm
