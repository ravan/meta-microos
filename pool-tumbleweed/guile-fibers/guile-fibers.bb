SUMMARY = "Concurrent ML-like concurrency for Guile"
DESCRIPTION = "Fibers is a library written in Guile which provides Concurrent ML-like concurrency."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "guile-fibers-1.3.1-2.11.aarch64.rpm"
RPM_HASH = "4547cd116853a3cde94df7e51a22db3d07366e877d17c1dd275c52bba12bf3ebb8dc0c1eac0a74a513ae35d406813cc9359b8882626647ff923a1830d0da333d"

RPROVIDES:${PN} += "guile-fibers"

RDEPENDS:${PN} += "guile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1"

inherit rpm
