SUMMARY = "GAP:"
DESCRIPTION = "A GAP Package for calculating the core-free subgroups and their \
faithful transitive permutation representations."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "gap-corefreesub-0.6-1.6.aarch64.rpm"
RPM_HASH = "13365d3d4d3ae27063d5f306fb13198d1fc3f4556c10c2359462d17d3559adc06ea781ef798b07a8b140f991d653440f299d17da2ceae00aca10e6400a9d3d3e"

RPROVIDES:${PN} += "gap-corefreesub"

RDEPENDS:${PN} += "gap-core \
gap-polycyclic \
graphviz"

inherit rpm
