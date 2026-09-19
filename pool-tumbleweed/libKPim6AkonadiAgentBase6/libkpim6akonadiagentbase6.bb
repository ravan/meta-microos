SUMMARY = "Akonadi Agent base library"
DESCRIPTION = "This package includes the agent library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiAgentBase6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b073bd435f488cb3945e36da04d6810e09d64ec208928283b7dfc64664f9362b27a1524686b65e37bb681ef29b74974ec74ea8f77e9c1a1c1aff383df5f7deb4"

RPROVIDES:${PN} += "libKPim6AkonadiAgentBase.so.6 \
libKPim6AkonadiAgentBase6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiPrivate.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
