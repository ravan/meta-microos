SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kactivitymanagerd6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "cc127907c6e4b673f3986cf5158368df1c929dc10106afdab4f68e58987d72f4d6d07d72628193f2df19ee323d3e8c38796599ea03e1e7fc9be17d7f91a96f93"

RPROVIDES:${PN} += "kactivitymanagerd \
kactivitymanagerd6 \
libkactivitymanagerd-plugin.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6Service.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
