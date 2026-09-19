SUMMARY = "XSL Processor"
DESCRIPTION = "Sablotron is an XSL processor fully implemented in C++. The excellent \
Expat parser is used as the associated XML parser."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "sablot-1.0.3-132.1.aarch64.rpm"
RPM_HASH = "ba64d06ed5060f887e15fe84d67ac7845aed310bdd9800f1747aa47180c70580db6d1cde8224ca5270b23f297959969804596e726788a6965ce4c4174fd29e06"

RPROVIDES:${PN} += "libsablot.so.0 \
sablot \
sablotron"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
