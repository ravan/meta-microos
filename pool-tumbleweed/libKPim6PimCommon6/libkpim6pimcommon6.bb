SUMMARY = "The PimCommon Library"
DESCRIPTION = "The PimCommon library"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6PimCommon6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "716d7830add12e6ac701cf9132aa5de009a4dd6655923e8e233c7f17a91cd28bd7d93bcd1f1a9934c66f0cdfa8cf6414205178dbef5c28141406944a4154da19"

RPROVIDES:${PN} += "libKPim6PimCommon.so.6 \
libKPim6PimCommon6 \
libKPim6PimCommonActivities.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextAutoCorrectionCore.so.1 \
libKF6TextCustomEditor.so.1 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
pimcommon"

inherit rpm
