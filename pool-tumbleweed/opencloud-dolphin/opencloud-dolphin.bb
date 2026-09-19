SUMMARY = "Dolphin Integrations for the OpenCloud desktop syncing client"
DESCRIPTION = " \
This package provides shell integration for the OpenCloud desktop sync client for KDE dolphin."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "opencloud-dolphin-1.0.0-2.5.aarch64.rpm"
RPM_HASH = "d84de74b0bee1656ff69c3afe8ee5435200a075886be4b4ec6bef844cbe1912bfe95acbfc6c71c7b1b4421ca37047d078fd9cbfa1ad9256bc2d55c492fed9950"

RPROVIDES:${PN} += "libopenclouddolphinpluginhelper.so \
opencloud-client-dolphin \
opencloud-dolphin"

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
opencloud-extensions-resources"

inherit rpm
