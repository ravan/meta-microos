SUMMARY = "LV2 port of MDA plugins"
DESCRIPTION = "MDA-LV2 is an LV2 port of the MDA plugins by Paul Kellett. It \
contains 36 high-quality plugins for a variety of tasks. \
 \
The instrument plugins make use of the new atom:AtomPort to receive \
MIDI. Apologies for any inconvenience, but this means they will \
only work in modern hosts which have implemented atom-based MIDI. \
The effects should work fine in any LV2 host."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.6"

RPM_NAME = "mda-lv2-1.2.6-1.18.aarch64.rpm"
RPM_HASH = "076e513b2da38cd0545a60f980aed549c80968e3c0fad4550d85c8a3067a18dded2344a0db6cf54b1bf9e1d5eb438930fdead8bb04a7d13e090ab3055d999a1a"

RPROVIDES:${PN} += "mda-lv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
