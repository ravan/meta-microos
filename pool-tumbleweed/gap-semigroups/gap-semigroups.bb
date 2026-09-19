SUMMARY = "GAP: Computing with Semigroups of Transformations and Partial Permutations"
DESCRIPTION = "The Semigroups package is a GAP package containing methods for \
semigroups, principally semigroups of transformations, partial \
permutations or subsemigroups of regular Rees 0-matrix semigroups. \
Semigroups contains more efficient methods than those available in \
the GAP library (and in many cases more efficient than any other \
software) for creating semigroups, calculating their Green's classes, \
size, elements, group of units, minimal ideal, small generating sets, \
testing membership, finding the inverses of a regular element, \
factorizing elements over the generators, and many more. It is also \
possible to test if a semigroup satisfies a particular property, such \
as if it is regular, simple, inverse, completely regular, and a \
variety of further properties."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.3"

RPM_NAME = "gap-semigroups-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "a633f6f533bbabfc6ef2c3a8a2ed80212c52626c32d7c49c9f79f6acb9016ab809ecb2eea4f0207b646ee1338d351413ac6253f97a0494c244612d6ffb11503f"

RPROVIDES:${PN} += "gap-semigroups"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gap-core \
gap-datastructures \
gap-digraphs \
gap-genss \
gap-images \
gap-io \
gap-orb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsemigroups.so.3 \
libstdc++.so.6"

inherit rpm
