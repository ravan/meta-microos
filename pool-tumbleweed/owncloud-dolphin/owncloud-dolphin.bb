SUMMARY = "Dolphin Integrations for the ownCloud desktop syncing client"
DESCRIPTION = " \
This package provides shell integration for the ownCloud desktop sync client \
for KDE dolphin."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.0"

RPM_NAME = "owncloud-dolphin-6.0.0-3.3.aarch64.rpm"
RPM_HASH = "bed720720c7dd7cc30390499aa6022d55274c0021c69a05b566bc949d67b5279e38ff2a224e048077dc05a2e1c0d96b0ab2bdc3e3a899ae68d5b05b68cf0f8ef"

RPROVIDES:${PN} += "libownclouddolphinpluginhelper.so \
owncloud-client-dolphin \
owncloud-dolphin"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
owncloud-extensions-resources"

inherit rpm
