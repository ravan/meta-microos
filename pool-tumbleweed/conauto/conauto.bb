SUMMARY = "Algorithm for graph isomorphism testing and automorphism group computation"
DESCRIPTION = "The 'conauto' algorithm tests whether two graphs are isomorphic. This is the \
reference implementation."
LICENSE = "GPL-3.0-or-later"

PV = "2.03"

RPM_NAME = "conauto-2.03-2.9.aarch64.rpm"
RPM_HASH = "46f146bcf1aa10170feb8e3dcca9528f789317800e1f1784dc1889da40ad8b83427e49651292436f8c11edc42c8cd826fcb13cb5101aa6687464174eee8712f6"

RPROVIDES:${PN} += "conauto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
