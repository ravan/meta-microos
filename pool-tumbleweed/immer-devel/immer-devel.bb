SUMMARY = "Persistent and immutable data structures written in C++"
DESCRIPTION = "immer is a library of persistent and immutable data structures written in C++. \
These enable whole new kinds of architectures for interactive and concurrent \
programs."
LICENSE = "BSL-1.0"

PV = "0.9.1"

RPM_NAME = "immer-devel-0.9.1-1.4.aarch64.rpm"
RPM_HASH = "7df541080f47b01d2138a91f7e0cbd27f5d59316c157d1fe8a45f92471fb3a6dc22593603aa93afa881be9755a00c6c53cfc88917346228de6762a7ed54754a9"

RPROVIDES:${PN} += "cmake-Immer \
immer-devel"

RDEPENDS:${PN} += ""

inherit rpm
