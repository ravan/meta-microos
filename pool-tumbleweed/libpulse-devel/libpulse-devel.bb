SUMMARY = "Development package for the pulseaudio library"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the files needed to compile programs that use the \
pulseaudio library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "libpulse-devel-17.0-7.5.aarch64.rpm"
RPM_HASH = "b4249bd4336214639537345f454ecff0b4b9c5d19678805cedd2cf30af9e71b577637a0bcd0859f66476ea068cf8ed9cb8c8a0810dfe6b23dd15caf6d5b04715"

RPROVIDES:${PN} += "libpulse-devel \
pkgconfig-libpulse \
pkgconfig-libpulse-mainloop-glib \
pkgconfig-libpulse-simple \
pulseaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpulse-mainloop-glib0 \
libpulse0 \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-libpulse"

inherit rpm
