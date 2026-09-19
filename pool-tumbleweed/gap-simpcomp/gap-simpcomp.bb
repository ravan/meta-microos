SUMMARY = "GAP toolbox for simplicial complexes"
DESCRIPTION = "simpcomp is a GAP package for working with simplicial complexes. It \
allows the computation of many properties of simplicial complexes \
(such as the f-, g- and h-vecors, the face lattice, the automorphism \
group, (co-)homology with explicit basis computation, intersection \
form, etc.) and provides the user with functions to compute new \
complexes from old (simplex links and stars, connected sums, \
cartesian products, handle additions, bistellar flips, etc.). \
 \
Furthermore, it comes with an extensive library of known \
triangulations of manifolds and provides the user with the \
possibility to create own complex libraries. simpcomp caches computed \
properties of a simplicial complex, thus avoiding unnecessary \
computations, internally handles the vertex labeling of the complexes \
and insures the consistency of a simplicial complex throughout all \
operations."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.14"

RPM_NAME = "gap-simpcomp-2.1.14-3.7.aarch64.rpm"
RPM_HASH = "eae5954d73b87a91def6c0275941824e1213f19354b4afb44452a5fb6875285c51f3b6f8635b9b130dbbc0621619707caabf40f8cea37911f175e1230884c9cb"

RPROVIDES:${PN} += "gap-simpcomp"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
gap-io \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
