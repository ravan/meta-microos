SUMMARY = "The Parma Polyhedra Library"
DESCRIPTION = "The Parma Polyhedra Library (PPL) is a library for the manipulation of \
(not necessarily closed) convex polyhedra and other numerical \
abstractions.  The applications of convex polyhedra include program \
analysis, optimized compilation, integer and combinatorial optimization \
and statistical data-editing.  The Parma Polyhedra Library comes with \
several user friendly interfaces, is fully dynamic (available virtual \
memory is the only limitation to the dimension of anything), written in \
accordance to all the applicable standards, exception-safe, rather \
efficient, thoroughly documented, and free software.  This package \
provides all what is necessary to run applications using the PPL \
through its C and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-1.2-3.12.aarch64.rpm"
RPM_HASH = "0c7248eb217f6ad78e23d55553ef9cb60fc269b67dd913d46626eb8ca4ab713bd8afeb47cec46d836a3b5253460b639c2a30734d225c6189a1fce04bc8fb8363"

RPROVIDES:${PN} += "ppl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libppl.so.14 \
libstdc++.so.6"

inherit rpm
