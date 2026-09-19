SUMMARY = "Libgravatar library for KDE PIM applications"
DESCRIPTION = "libgravatar adds support for downloading and displaying gravatars in \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6Gravatar6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ce03c4639794b5c24c31107d92a858212f8e493cc2b649ca1d21f0f403d38b436aec8ac68c50b7cecc2f0d87a9f0089c524038a465241dad7e304cecc436cc74"

RPROVIDES:${PN} += "libKPim6Gravatar.so.6 \
libKPim6Gravatar6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgravatar \
libstdc++.so.6"

inherit rpm
