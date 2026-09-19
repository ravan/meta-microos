SUMMARY = "A batch renamer by KDE"
DESCRIPTION = "KRename is a powerful batch renamer for KDE. It allows you to easily rename \
hundreds or even more files in one go. The filenames can be created by parts of \
the original filename, numbering the files or accessing hundreds of informations \
about the file, like creation date or Exif informations of an image."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2git.20250321T014623~262bdbe"

RPM_NAME = "krename-5.0.2git.20250321T014623~262bdbe-1.6.aarch64.rpm"
RPM_HASH = "26791ba07eb650755955f29906a8f6fd6ac9164bd4cc55ce44e0208c8521633ea6a6e6e9f679c847ce7edff8a8fb19b5b5b97cfbd404fee02375b63777baa0f6"

RPROVIDES:${PN} += "krename"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libexiv2.so.28 \
libfreetype.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.2"

inherit rpm
