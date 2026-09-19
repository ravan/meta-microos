SUMMARY = "PostScript support for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This package contains the plugins required \
to display PostScript documents and images."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "okular-spectre-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "205f3eb77fc275a45263ad4fa86e597ba9732376cc7165e6308ac0e2f3fea1ce5676c3865fa1ed7e5d88d2b3cdef3ee4140f1ec5f5a1a49c57fbd543d089e2d9"

RPROVIDES:${PN} += "okular-spectre"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libOkular6Core.so.4 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libspectre.so.1 \
libstdc++.so.6 \
okular"

inherit rpm
