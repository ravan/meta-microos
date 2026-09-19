SUMMARY = "Freecell Solver development package"
DESCRIPTION = "Development package for the libfreecell-solver library"
LICENSE = "MIT"

PV = "6.16.0"

RPM_NAME = "freecell-solver-devel-6.16.0-1.5.aarch64.rpm"
RPM_HASH = "05daf7279d17e9b7e593ea604a5a09e07802791650c66db1dc8490ca3b58a9228771cd57c3fc721996424553ce2846304812436d42e0063197593898dd6fedf9"

RPROVIDES:${PN} += "freecell-solver-devel \
pkgconfig-libfreecell-solver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreecell-solver0"

inherit rpm
