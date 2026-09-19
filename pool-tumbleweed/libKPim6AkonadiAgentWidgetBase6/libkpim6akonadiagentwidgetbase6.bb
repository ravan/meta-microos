SUMMARY = "Akonadi Agent widget library"
DESCRIPTION = "This package include base widgets for Akonadi agents, part of the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiAgentWidgetBase6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "fbebae5e4d9bb37d1f30f1b1ac2d163eefd375e970961937524c30533a61cb13f45f00b679936043cc75b5e45be75769df963c77ba8c17e77b6d125aed7833b7"

RPROVIDES:${PN} += "libKPim6AkonadiAgentWidgetBase.so.6 \
libKPim6AkonadiAgentWidgetBase6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigWidgets.so.6 \
libKF6IconThemes.so.6 \
libKPim6AkonadiAgentBase.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
