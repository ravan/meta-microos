SUMMARY = "CLI tool to render text-mode art files as PNG files"
DESCRIPTION = "Ansilove-Term is a command line tool to render text-mode art files as \
PNG files, as well as displaying in several different mediums."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git.20190908"

RPM_NAME = "ansilove-term-0.0.0+git.20190908-2.12.aarch64.rpm"
RPM_HASH = "d8a3359f5bd7ed27b6a60791226a4c291c61e47764c05fe1e45a6dae523a4e9971b5c197cbb23d95f2a094fcf2b0c58186150cc3e682716bfd03e4c1b83dcdc0"

RPROVIDES:${PN} += "ansilove-term"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
