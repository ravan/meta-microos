SUMMARY = "Library for gathering DiscIDs and ISRCs from audio CDs"
DESCRIPTION = "libdiscid is a C library for creating MusicBrainz and freedb DiscIDs \
from audio CDs. \
It reads a CD's table of contents (TOC) and generates an identifier \
which can be used to lookup the CD at MusicBrainz. \
Additionally, it provides a submission URL for adding the DiscID to the \
database and gathers ISRCs and the MCN from disc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0"

RPM_NAME = "libdiscid0-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "637f7f2efd3b3e1b22f1d7e90a403db21a9582249f862b558a392914af4047ee493136e5c7b4d674937c0ea56c43c3a0371e0de3fe862bd8f13decb2351ff07c"

RPROVIDES:${PN} += "libdiscid.so.0 \
libdiscid0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
