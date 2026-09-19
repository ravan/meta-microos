SUMMARY = "LIRC module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides support for IR and RF remotes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-module-lirc-17.0-7.5.aarch64.rpm"
RPM_HASH = "acb431984162af21fec0eacbfe0c2473fec6af82bb03ee77d068649e91cfc5fba6727f5d118ef74213eb4b23852b0643d023f304680b21a87649482eb2b00fbd"

RPROVIDES:${PN} += "pulseaudio-module-lirc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblirc-client.so.0 \
libpulsecommon-17.0.so \
libpulsecore-17.0.so \
pulseaudio"

inherit rpm
