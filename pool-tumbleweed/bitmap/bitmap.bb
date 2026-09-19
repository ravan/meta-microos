SUMMARY = "X bitmap editor and converter utilities"
DESCRIPTION = "The bitmap program is a rudimentary tool for creating or editing \
rectangular images made up of 1's and 0's. Bitmaps are used in X for \
defining clipping regions, cursor shapes, icon shapes, and tile and \
stipple patterns. \
 \
The bmtoa and atobm filters convert bitmap files to and from ASCII \
strings. They are most commonly used to quickly print out bitmaps and \
to generate versions for including in text."
LICENSE = "X11"

PV = "1.1.2"

RPM_NAME = "bitmap-1.1.2-1.5.aarch64.rpm"
RPM_HASH = "ce2d2cffd4c7af8f0b21085e314c36a61f22d3adc656bf2888ddd42fb2b81c428bc6e7e215d9c844066f38a987a2990f1b5a74ca4613a49d50e7b0b5570b51e8"

RPROVIDES:${PN} += "bitmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
