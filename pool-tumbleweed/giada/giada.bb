SUMMARY = "Sampler Audio Tool"
DESCRIPTION = "Giada is an audio tool for DJs and live performers. Up to 32 samples \
may be loaded or recorded, and may be played in single mode (drum \
machine) or loop mode (sequencer). The keyboard can be used to \
control this."
LICENSE = "(AGPL-3.0-only | GPL-2.0-or-later) & GPL-3.0-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & OFL-1.1 & Zlib"

PV = "1.5.0"

RPM_NAME = "giada-1.5.0-1.2.aarch64.rpm"
RPM_HASH = "dd273f0e85f42e3feb0912a07c31f7d54d813b1e58aa1409e14ed6075070423f1b4d02b0e08e51bd761158ad0daad23e28c4ba54946b16c16c513aebc3880a58"

RPROVIDES:${PN} += "giada"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXfixes.so.3 \
libXinerama.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libfmt.so.12 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjack.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
librtmidi.so.7 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0 \
libz.so.1"

inherit rpm
