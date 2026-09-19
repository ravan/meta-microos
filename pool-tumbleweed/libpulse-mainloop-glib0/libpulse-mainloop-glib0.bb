SUMMARY = "GLIB 2.0 Main Loop wrapper for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the GLIB Main Loop bindings for the PulseAudio \
sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "libpulse-mainloop-glib0-17.0-7.5.aarch64.rpm"
RPM_HASH = "17c0a7747127a56fd6a3b4408bf48995ab95ab3b50de9e22a908863c40900fc11afc2a07dc62377e41bd26f0c49918b3ac7e5e3a86e09112bc2fc9d306d0f2a3"

RPROVIDES:${PN} += "libpulse-mainloop-glib.so.0 \
libpulse-mainloop-glib0 \
pulseaudio-libs-glib2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpulsecommon-17.0.so"

inherit rpm
