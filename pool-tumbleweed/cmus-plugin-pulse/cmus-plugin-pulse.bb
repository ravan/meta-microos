SUMMARY = "Pulseaudio output plugin for the C* Music Player"
DESCRIPTION = "This package provides PulseAudio output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-pulse-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "9eba9a58fd22d76f5ca1e1331a6526d33c0cd5b11c82188bd7760517df993b7afe5e68dc05215a19de0430a9f500ca05598f3d8a9e6179309ca81aee92a72132"

RPROVIDES:${PN} += "cmus-plugin-pulse"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse.so.0"

inherit rpm
