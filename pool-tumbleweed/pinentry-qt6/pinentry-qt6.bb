SUMMARY = "Simple PIN or Passphrase Entry Dialog for QT5"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using the QT5 UI toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "pinentry-qt6-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "ace9c9b9cc4d09f79a963d87acd7355025d7f1930fb902d187d9782f18f91bf78cea4607ca36d73e350c0763434654317b67c39c095587eb78f6d0e32b2418c9"

RPROVIDES:${PN} += "pinentry-dialog \
pinentry-gui \
pinentry-qt \
pinentry-qt4 \
pinentry-qt5 \
pinentry-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libassuan.so.9 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpg-error.so.0 \
libncursesw.so.6 \
libsecret-1.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
pinentry"

inherit rpm
