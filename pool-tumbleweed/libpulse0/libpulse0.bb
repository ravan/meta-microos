SUMMARY = "Client interface to PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the system libraries for clients of pulseaudio \
sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "libpulse0-17.0-7.5.aarch64.rpm"
RPM_HASH = "200c0e9a84315c3513fe5efd4f4fb575bf07c65d06f55ab2f1d3d51b19319ca0ed373f35f964d2cf7e60688d86ab6a1e7f2b46d9f3ebbf16a919aeb7de409e9d"

RPROVIDES:${PN} += "config-libpulse0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libpulse0 \
libpulsecommon-17.0.so \
pulseaudio-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libm.so.6 \
libsndfile.so.1 \
libsystemd.so.0 \
libxcb.so.1"

inherit rpm
