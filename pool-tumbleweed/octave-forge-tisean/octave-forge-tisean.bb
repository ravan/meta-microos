SUMMARY = "Nonlinear Time Series Analysis"
DESCRIPTION = "TISEAN stands for TIme SEries ANalysis. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "octave-forge-tisean-0.2.3-3.2.aarch64.rpm"
RPM_HASH = "f98bc46fd6c13b152d419d2590ba1c6159d5694c24f084132d113e4b5082fedb3506166aa2ab18d57cc58dc2d73072feddc6e76ee70cac78c3fe4acf16cabf54"

RPROVIDES:${PN} += "octave-forge-tisean"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli \
octave-forge-signal"

inherit rpm
