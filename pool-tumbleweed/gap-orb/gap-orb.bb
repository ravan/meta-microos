SUMMARY = "GAP: Methods to enumerate Orbits"
DESCRIPTION = "The orb package is about enumerating orbits in various ways."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.0"

RPM_NAME = "gap-orb-5.1.0-1.3.aarch64.rpm"
RPM_HASH = "ce672e2c66a01787295e6190e17d174194eacebdf8e19c024dc7d568d43ee6866c910f248d86159313f61bf2541f205898ce2c3b438ca57fc5c1b78b40db132b"

RPROVIDES:${PN} += "gap-orb"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
