SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cpp13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "899c18a4c2649fbf515a808a30ea750c865aa5a3939a76213568a99fab40f644634015a24cf474b6f063d5a6ac2d09dc9a7f6eead9e00f23e4d4a34e6df03178"

RPROVIDES:${PN} += "cpp13"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
