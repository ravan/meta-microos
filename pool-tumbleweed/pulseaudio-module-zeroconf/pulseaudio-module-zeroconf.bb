SUMMARY = "Zeroconf module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides zeroconf network support for the PulseAudio sound server"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-module-zeroconf-17.0-7.5.aarch64.rpm"
RPM_HASH = "45cef02ead67289782ab50114772d0cb654b55f6ef4b09f4853869933535e7ce56eae728913ea5eb9139b9ca06b7272d8c11c3f48d1117453fb9cb57bb55fa12"

RPROVIDES:${PN} += "libavahi-wrap.so \
libraop.so \
pulseaudio-module-zeroconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libprotocol-native.so \
libpulse.so.0 \
libpulsecommon-17.0.so \
libpulsecore-17.0.so \
librtp.so \
pulseaudio"

inherit rpm
