SUMMARY = "KDE PIM Libraries: Identity Management - widgets library"
DESCRIPTION = "This package provides graphical widgets to handle multiple email identities \
and associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6IdentityManagementWidgets6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "7ce374fad100cca60d05fe3e5c21c93d1f61bc7cdc794809826ee60f385f75e026461fe79fadcbdc1093edfd444f3ff20f26e89b2401de9f39aec3940e1f264d"

RPROVIDES:${PN} += "libKPim6IdentityManagementWidgets.so.6 \
libKPim6IdentityManagementWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6TextCustomEditor.so.1 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6IdentityManagementCore6 \
libKPim6TextEdit.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
