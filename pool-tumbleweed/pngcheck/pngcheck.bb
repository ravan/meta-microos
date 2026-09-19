SUMMARY = "PNG file format checker"
DESCRIPTION = "pngcheck verifies the integrity of PNG, JNG and MNG files (by checking the \
internal 32-bit CRCs or checksums) and optionally dumps almost all of the \
chunk-level information in the image in human-readable form. For example, it \
can be used to print the basic stats about an image (dimensions, bit depth, \
etc.); to list the color and transparency info in its palette; or to extract \
the embedded text annotations. All PNG and JNG chunks are supported, plus \
almost all MNG chunks (everything but PAST, DISC, tERm, DROP, DBYK, and \
ORDR). This is a command-line program with batch capabilities (e.g., \
``pngcheck *.png'')."
LICENSE = "HPND"

PV = "4.0.1"

RPM_NAME = "pngcheck-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "20df6297758d3a93b876edc6fd69565b106224302682a21c8f6a641e1fbd072b91373ec609adc9f4620eb26563152ea1d1eb3ae208222318706f3b1c660df95a"

RPROVIDES:${PN} += "pngcheck"

RDEPENDS:${PN} += "libc.so.6 \
libz.so.1"

inherit rpm
