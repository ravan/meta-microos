SUMMARY = "Matching Algorithm with Recursively Implemented StorAge"
DESCRIPTION = "Matching Algorithm with Recursively Implemented StorAge (MARISA) is a \
static and space-efficient trie data structure. And libmarisa is a C++ \
library to provide an implementation of MARISA. Also, the package of \
libmarisa contains a set of command line tools for building and \
operating a MARISA-based dictionary. \
 \
A MARISA-based dictionary supports not only lookup but also reverse \
lookup, common prefix search and predictive search."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "marisa-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "2bc894af2198ac5ec7e395df61798fa09e2a162ba81fd92dcbc5511170a15e15386ed35fc905de1704601ef30e8c3867a5d490d1c5feb7d1020d896fc1813663"

RPROVIDES:${PN} += "marisa \
marisa-trie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmarisa.so.0 \
libstdc++.so.6"

inherit rpm
