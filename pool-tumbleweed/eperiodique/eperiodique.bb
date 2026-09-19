SUMMARY = "Periodic table of elements in EFL"
DESCRIPTION = "Graphical application that display the periodic table of the elements. It shows \
basic data for each element, pictures, Bohr models and lattice structures."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "eperiodique-0.5-3.42.aarch64.rpm"
RPM_HASH = "f8fc03b9089ee093c057b673f0766ffd5b18e1731fb9e2f9731b4ae8a1a62452a3da77c556ffc35da70baca4bf5726565a0827017d53bc8ebe584f61ffa33293"

RPROVIDES:${PN} += "eperiodique"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libecore.so.1 \
libedje.so.1 \
libeina.so.1 \
libelementary.so.1 \
libevas.so.1"

inherit rpm
