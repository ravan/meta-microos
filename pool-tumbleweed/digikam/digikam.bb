SUMMARY = "A KDE Photo Manager"
DESCRIPTION = "digiKam is a simple digital photo management application for KDE, which \
allows you to import and organize your digital photos easily. The \
photos can be organized in albums, which can be sorted chronologically, \
by directory layout, or by custom collections. An easy-to-use interface \
that enables you to connect to your camera and preview, download, or \
delete your images, is provided."
LICENSE = "GPL-2.0-or-later"

PV = "9.1.0"

RPM_NAME = "digikam-9.1.0-1.2.aarch64.rpm"
RPM_HASH = "fb61f55ce3a0ebe4424b17b71d0c828dbec99f244e581b7893b14fbe3d398e79ff3cd1113a83dfa5436bc9481a10ccbb3b04018ca31ec1d5737a34d204d0af91"

RPROVIDES:${PN} += "digikam \
digikam-doc \
digikam-plugin-color \
digikam-plugin-decorate \
digikam-plugin-enhance \
digikam-plugin-fxfilters \
digikam-plugin-transform"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
digikam-plugins \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libMagick++-7.Q16HDRI.so.5 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdigikamcore.so.9.1.0 \
libdigikamdatabase.so.9.1.0 \
libdigikamgui.so.9.1.0 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
