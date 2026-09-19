SUMMARY = "Verdict library for evaluating the geometric qualities of regions of space"
DESCRIPTION = "Verdict is a library for evaluating the geometric qualities of regions of space."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "libverdict1_4-1.4.4-1.5.aarch64.rpm"
RPM_HASH = "4ada554f44cad0ce2d28f76a8e5cacac9d3070cf8bc9c99b9c948b32c8269128f4a89476de37944e1f235dcfd0dc37f4018af88e6944dbe0772035b08143bcfc"

RPROVIDES:${PN} += "libverdict.so.1.4 \
libverdict1-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
