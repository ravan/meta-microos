SUMMARY = "A photo administration utility"
DESCRIPTION = "KPhotoAlbum is a tool to help describe images, and to search in the pile \
of images. With KPhotoAlbum it is today possible to find any image \
in less than 5 seconds, let that be an image with a special person, \
an image from a special place, or even both."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "kphotoalbum-6.2.0-1.4.aarch64.rpm"
RPM_HASH = "3d12560c0172557010197052fe1972e03c7ec04eb71b7e7ccc6564ba7596cd49466839a80e2b166643c49af38a0f8d22c6fa984e07fdf6dc66f65aa59e03a283"

RPROVIDES:${PN} += "kphotoalbum \
libkpabase.so \
libkpaexif.so \
libkpathumbnails.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKDcrawQt6.so.5 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6Service.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libmarblewidget-qt6.so.28 \
libphonon4qt6.so.4 \
libstdc++.so.6 \
libvlc.so.5 \
qt6-sql-sqlite"

inherit rpm
