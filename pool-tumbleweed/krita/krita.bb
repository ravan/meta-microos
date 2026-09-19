SUMMARY = "Digital Painting Application"
DESCRIPTION = "Krita is a painting program. It supports concept art, texture and \
matte painters, as well as illustrations and comics."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & CC0-1.0 & LGPL-2.0-only"

PV = "5.3.3"

RPM_NAME = "krita-5.3.3-1.2.aarch64.rpm"
RPM_HASH = "10936e3743e2ffbf909474c30db4d0ef583ae011833ae3c163459b0432b6b13ae00ba096a28d6ebfe17e9f38a923c0bb6e7dd753b0bb85a574893836286bbdc7"

RPROVIDES:${PN} += "calligra-krita \
krita \
libkritabasicflakes.so.20 \
libkritacolor.so.20 \
libkritacommand.so.20 \
libkritaexifcommon.so.20 \
libkritaflake.so.20 \
libkritaglobal.so.20 \
libkritaimage.so.20 \
libkritaimpex.so.20 \
libkritalibbrush.so.20 \
libkritalibkis.so.20 \
libkritalibkra.so.20 \
libkritalibpaintop.so.20 \
libkritametadata.so.20 \
libkritamultiarch.so.20 \
libkritapigment.so.20 \
libkritaplugin.so.20 \
libkritapsd.so.20 \
libkritapsdutils.so.20 \
libkritaqmicinterface.so.20 \
libkritaqmlcomponents.so \
libkritaqmlwidgets.so.20 \
libkritaresources.so.20 \
libkritaresourcewidgets.so.20 \
libkritastore.so.20 \
libkritatiffpsd.so.20 \
libkritaui.so.20 \
libkritaversion.so.20 \
libkritawidgets.so.20 \
libkritawidgetutils.so.20 \
qt5qmlimport-org.krita.components.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-2.so.30 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KDcraw.so.5 \
libKF5WidgetsAddons.so.5 \
libKSeExpr.so.4 \
libKSeExprUI.so.4 \
libOpenColorIO.so.2.5 \
libOpenEXR-3-4.so.33 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libc.so.6 \
libexiv2.so.28 \
libfftw3.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgif.so.7 \
libgsl.so.28 \
libgslcblas.so.0 \
libharfbuzz.so.0 \
libheif.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblcms2.so.2 \
libm.so.6 \
libmlt++-7.so.7 \
libmlt-7.so.7 \
libmypaint.so.0 \
libopenjp2.so.7 \
libpng16.so.16 \
libpoppler-qt5.so.1 \
libpython3.13.so.1.0 \
libquazip1-qt5.so.1.7 \
libstdc++.so.6 \
libtiff.so.6 \
libturbojpeg.so.0 \
libunibreak.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libz.so.1 \
qt5qmlimport-QtQml.2"

inherit rpm
