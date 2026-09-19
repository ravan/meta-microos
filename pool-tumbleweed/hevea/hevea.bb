SUMMARY = "A fast LaTeX to HTML translator"
DESCRIPTION = "HEVEA is a LaTeX to HTML translator.  The input language is a fairly \
complete subset of LaTeX2e (old LaTeX style is also accepted) and \
the output language is HTML."
LICENSE = "LGPL-2.0-only & QPL-1.0"

PV = "2.38"

RPM_NAME = "hevea-2.38-1.9.aarch64.rpm"
RPM_HASH = "3550823b8d5631f7d4f829d753359e58e7068e8a1c983046f788265c238abb5fa4481a9a0b6ec5f9452f83e6f0ed9bde361bf72939e7118a3620d4f7b2e7c991"

RPROVIDES:${PN} += "hevea"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libm.so.6"

inherit rpm
