SUMMARY = "General-purpose scalable concurrent malloc implementation"
DESCRIPTION = "jemalloc is a general-purpose scalable concurrent malloc(3) implementation. \
This package provides a shell wrapper script to run programs using jemalloc."
LICENSE = "BSD-2-Clause"

PV = "5.3.1"

RPM_NAME = "jemalloc-5.3.1-1.4.aarch64.rpm"
RPM_HASH = "4f5b649641686d8eb2cea8e18665c5e6a32273c5ddce0d970fd12d8435d9126105e6b1a49a171c5fe6684a61640db8df3e65fa429f63fcaa8067132aab20b298"

RPROVIDES:${PN} += "jemalloc"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
libjemalloc2"

inherit rpm
