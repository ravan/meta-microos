SUMMARY = "Conservative DOOM/Heretic/Hexen/Strife source port"
DESCRIPTION = "Chocolate Doom is a Doom source port with focus on accurate \
reproduction of the original DOS version of Doom and other games \
based on the Doom engine. There are no new features, a lack of high \
resolution rendering, and goes as far as to duplicate or recreate \
bugs and crashes found in the DOS executable that were fixed before \
the initial open-sourcing of the Doom engine."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.1"

RPM_NAME = "chocolate-doom-3.1.1-1.6.aarch64.rpm"
RPM_HASH = "012cdf74f9ccd55e735d3e7e05543d75059aac3e97187c2afb7c5f318ba4848b392a8324f550006d327879b87c04fa0bd89f43a1a304f4ffb57d2c67950980ca"

RPROVIDES:${PN} += "chocolate-doom \
chocolate-doom-bash-completion \
chocolate-heretic \
chocolate-hexen \
chocolate-strife"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libm.so.6 \
libpng16.so.16 \
libsamplerate.so.0"

inherit rpm
