SUMMARY = "KDE PIM Libraries: Interface to Contacts"
DESCRIPTION = "This package provides the interface to contacts for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6KontactInterface6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c9ec5bdfb873c565b02f099040a95bb802eab3d10a3cb582f521929eb34610b24825a45081d4adfb29e797892988e6db762aca6fb9326f4c77dc24a9e72761bf"

RPROVIDES:${PN} += "libKPim6KontactInterface.so.6 \
libKPim6KontactInterface6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kontactinterface \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6KIOGui.so.6 \
libKF6Parts.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
