SUMMARY = "Qt5-based Password Manager"
DESCRIPTION = "A password manager or safe which manages your passwords. Databases \
are locked with a master key/password or a key disk. The databases \
are encrypted using AES and Twofish."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.7.12"

RPM_NAME = "keepassxc-2.7.12-1.7.aarch64.rpm"
RPM_HASH = "81dc43478d7ecc66cc24d7c8960c94823b71b4a7198d8eb5359b7f082c6b9f25e7d5138ae7f4c9d3c03a6df438386cd835980dadd97c80c90fa42e5867da7bab"

RPROVIDES:${PN} += "keepassx \
keepassxc \
libkeepassxc-autotype-xcb.so"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXtst.so.6 \
libargon2.so.1 \
libbotan-3.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libminizip.so.1 \
libpcsclite.so.1 \
libqrencode.so.4 \
libreadline.so.8 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
shared-mime-info"

inherit rpm
