SUMMARY = "Framework to integrate services and actions - GUI library"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need. \
 \
This package contains the library files of the package needed to use GUI widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6PurposeWidgets6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "081c6063719264da521683a7f2414847a6e3c5714d5dfb022b1d788e7a3bce6c691100b5413a77d101f99e1f329eb54c4fc7e560cd31a3f7552b071a07790ce2"

RPROVIDES:${PN} += "libKF6PurposeWidgets.so.6 \
libKF6PurposeWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6I18nQml.so.6 \
libKF6Purpose.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
