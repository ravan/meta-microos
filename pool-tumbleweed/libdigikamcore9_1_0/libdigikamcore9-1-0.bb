SUMMARY = "The main digikam libraries"
DESCRIPTION = "The main digikam libraries that are being shared between showfoto and digikam"
LICENSE = "GPL-2.0-or-later"

PV = "9.1.0"

RPM_NAME = "libdigikamcore9_1_0-9.1.0-1.2.aarch64.rpm"
RPM_HASH = "6a835c82cacaf5b15f1b5d734726bf58f42d29c2a2641109607271521a35e9263cf0aa121099c061742c6e9394c70aaac6f0042060f53978017e4a8643b31c83"

RPROVIDES:${PN} += "libdigikamcore.so.9.1.0 \
libdigikamcore9-1-0 \
libdigikamdatabase.so.9.1.0 \
libdigikamgui.so.9.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiContactCore.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6StateMachine.so.6 \
libQt6Svg.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libexiv2.so.28 \
libexpat.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgomp.so.1 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libheif.so.1 \
libjasper.so.7 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblcms2.so.2 \
liblensfun.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-dnn.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libopencv-ml.so.413 \
libopencv-objdetect.so.413 \
libpng16.so.16 \
libstdc++.so.6 \
libswscale.so.9 \
libz.so.1"

inherit rpm
