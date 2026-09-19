SUMMARY = "Library for gathering DiscIDs and ISRCs from audio CDs"
DESCRIPTION = "libdiscid is a C library for creating MusicBrainz and freedb DiscIDs \
from audio CDs. \
It reads a CD's table of contents (TOC) and generates an identifier \
which can be used to lookup the CD at MusicBrainz. \
Additionally, it provides a submission URL for adding the DiscID to the \
database and gathers ISRCs and the MCN from disc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0"

RPM_NAME = "libdiscid-devel-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "ee78f6bd8bafcbc64df6c8d1c8d860157adc9cf8b71362c3e3f5787e1a32973ed963575a21b1b7b7858f58c9fef86dc1977a51c7942cd0370d2b587695aded13"

RPROVIDES:${PN} += "libdiscid-devel \
pkgconfig-libdiscid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdiscid0"

inherit rpm
