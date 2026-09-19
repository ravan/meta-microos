SUMMARY = "KDE Text Editor"
DESCRIPTION = "KWrite is a text editor by KDE."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kwrite-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "61c23fb82d6f9e92d99771e7499677ff3c4ff017106989ac3ad879b3683d2e628dbe7b7f960090cf39a59400e91e536440f91b9094e723cf3b61c6a86c1161d9"

RPROVIDES:${PN} += "kwrite"

RDEPENDS:${PN} += "kate-plugins \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkateprivate.so.26.08.1"

inherit rpm
