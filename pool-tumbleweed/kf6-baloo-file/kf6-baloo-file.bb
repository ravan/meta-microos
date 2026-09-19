SUMMARY = "Filesearch components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains filesearch components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-baloo-file-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e0aed4e300cde6b8e44c77d8d9de06a5c8dd7b20c0136040732b7b0bca055a415a5eac1e74be9438d627a7a38a97528332ca3ddc08df821fda498925083efd49"

RPROVIDES:${PN} += "kf6-baloo-file"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6Baloo.so.6 \
libKF6BalooEngine.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6Solid.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
