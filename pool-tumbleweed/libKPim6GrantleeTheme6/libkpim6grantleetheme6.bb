SUMMARY = "GrantleeTheme library for KDE PIM applications"
DESCRIPTION = "The GrantleeTheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6GrantleeTheme6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2d3aaf1928e78ba14feee101874c06cb07f7b88d38eb8ac8177704aac7cdefa79bf7d6944403cdae91d77a14000fc03dd39cfbf62f8417c187b6afbbae2d03e7"

RPROVIDES:${PN} += "libKPim6GrantleeTheme.so.6 \
libKPim6GrantleeTheme6"

RDEPENDS:${PN} += "/sbin/ldconfig \
grantleetheme \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6TextTemplate.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
