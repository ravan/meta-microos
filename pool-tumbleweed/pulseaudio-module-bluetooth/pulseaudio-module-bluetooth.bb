SUMMARY = "Bluetooth support for the PulseAudio sound server"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
Contains Bluetooth audio (A2DP/HSP/HFP) support for the PulseAudio sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-module-bluetooth-17.0-7.5.aarch64.rpm"
RPM_HASH = "c1e81338318928a2ac0cdd132c04d55b17b0b1a364fae2b42bc831c2ca02829e2446cc8f79f1cdbd7ad1c0e8a124b6566a7c36ba2171966246bdacf9367e40bb"

RPROVIDES:${PN} += "libbluez5-util.so \
pulseaudio-module-bluetooth"

RDEPENDS:${PN} += "bluez \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0 \
libpulse.so.0 \
libpulsecommon-17.0.so \
libpulsecore-17.0.so \
libsbc.so.1 \
pulseaudio"

inherit rpm
