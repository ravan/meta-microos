SUMMARY = "Waveform viewer for Ditital Signals"
DESCRIPTION = "GTKWave is a waveform viewer that can view VCD files produced by most Verilog \
simulation tools, as well as LXT files produced by certain Verilog simulation \
tools."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.126"

RPM_NAME = "gtkwave-3.3.126-2.5.aarch64.rpm"
RPM_HASH = "4483a78bc24e911a158b6db885e66aaa936a66267db61ba7eb89828343bef30855d3ac784337ce5934b229862728a3b4fe21cd4b1e86e4ee1ab49766808b1996"

RPROVIDES:${PN} += "gtkwave"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libJudy.so.1 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblzma.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libtcl8.6.so \
libtk8.6.so \
libz.so.1"

inherit rpm
