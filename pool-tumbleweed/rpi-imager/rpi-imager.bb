SUMMARY = "Raspberry Pi Imaging Utility"
DESCRIPTION = "Raspberry Pi Imager is the quick and easy way to install Raspberry Pi OS and \
other operating systems to a microSD card, ready to use with your Raspberry \
Pi. Watch our 45-second video to learn how to install an operating system \
using Raspberry Pi Imager. \
 \
Download and install Raspberry Pi Imager to a computer with an SD card reader. \
Put the SD card you'll use with your Raspberry Pi into the reader and run \
Raspberry Pi Imager. \
 \
NOTE: Relies on polkit when run as regular user. It doesn't have to be \
      polkit-gnome, but it has a low install base overhead."
LICENSE = "Apache-2.0"

PV = "2.0.6"

RPM_NAME = "rpi-imager-2.0.6-1.4.aarch64.rpm"
RPM_HASH = "b688e557d5c11ae26192a292f67d365603240c00ee0cefe28175c50be6d96fa8c68d79abbdef44488832f94912d1d435288aca197cd2195aef9bb290b35cc5f7"

RPROVIDES:${PN} += "rpi-imager"

RDEPENDS:${PN} += "dosfstools \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libgnutls.so.30 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6 \
udisks2 \
util-linux-systemd"

inherit rpm
