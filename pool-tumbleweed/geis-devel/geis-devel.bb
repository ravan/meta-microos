SUMMARY = "Development files for the GEIS interface implementation"
DESCRIPTION = "GEIS is a library for applications and toolkit programmers which \
provides a consistent platform independent interface for any \
system-wide input gesture recognition mechanism."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "geis-devel-2.2.17-5.10.aarch64.rpm"
RPM_HASH = "7c3367d197f1663e8f23476353ea3362892fd6820b72329154842136c4107e343d94d881524b75566b9dfd9ae90eb2605a29186f688bdf8d031189819e29218b"

RPROVIDES:${PN} += "geis-devel \
pkgconfig-libgeis"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeis1"

inherit rpm
