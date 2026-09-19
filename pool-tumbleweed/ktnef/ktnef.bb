SUMMARY = "Viewer for email attachments in TNEF format"
DESCRIPTION = "KTNEF is a viewer for email attachments in the TNEF format."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "ktnef-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e0c330c30d3ac2becb3e84e9ad23507635eaac6e7fedb3e91fd8450424b0d9fb36c1840a83ec5aeb2c86b89fd8e109c0af8df8b0d2d97e2d8d06813344a09ddd"

RPROVIDES:${PN} += "ktnef \
ktnef5"

RDEPENDS:${PN} += "kdepim-runtime \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6Tnef.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
