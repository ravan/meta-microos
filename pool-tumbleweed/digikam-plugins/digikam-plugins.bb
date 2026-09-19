SUMMARY = "DigiKam plugins"
DESCRIPTION = "Additional plugins for digiKam."
LICENSE = "GPL-2.0-or-later"

PV = "9.1.0"

RPM_NAME = "digikam-plugins-9.1.0-1.2.aarch64.rpm"
RPM_HASH = "5d2c5299eb4f87c321c78d00cb930540cffa075f181c329ba2cae56e343b9931cdb3a2f5b609adbdfa8fabf1922cd4f16afd322d8d8395c656d1432949f6c114"

RPROVIDES:${PN} += "digikam-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6ThreadWeaver.so.6 \
libKF6XmlGui.so.6 \
libKSaneWidgets6.so.6 \
libMagick++-7.Q16HDRI.so.5 \
libMagickCore-7.Q16HDRI.so.10 \
libOpenGL.so.0 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libdigikamcore.so.9.1.0 \
libdigikamdatabase.so.9.1.0 \
libdigikamgui.so.9.1.0 \
libexslt.so.0 \
libgcc-s.so.1 \
libheif.so.1 \
libjasper.so.7 \
libjpeg.so.8 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
