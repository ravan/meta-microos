SUMMARY = "GSettings module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides GSettings storage of PulseAudio sound server settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-module-gsettings-17.0-7.5.aarch64.rpm"
RPM_HASH = "7c87d0cc16754ad3eb24f5938fda4b12b22acd1a81be2b2add6ad11921136b35ab002cc7dc54043e565a5813aad6c4953d94ffab7ca91e2c93fa191b27614f0b"

RPROVIDES:${PN} += "pulseaudio-module-gsettings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpulsecommon-17.0.so \
libpulsecore-17.0.so \
pulseaudio"

inherit rpm
