SUMMARY = "Tools for computations in affine monoids and rational cones"
DESCRIPTION = "Normaliz is a tool for computations in affine monoids, vector configurations, \
lattice polytopes, and rational cones. It supports, \
 \
* convex hulls and dual cones \
* conversion from generators to constraints and vice versa \
* triangulations, disjoint decompositions and Stanley decompositions \
* Hilbert basis of rational, not necessarily pointed cones \
* normalization of affine monoids \
* lattice points of rational polytopes and (unbounded) polyhedra \
* Hilbert (or Ehrhart) series and (quasi) polynomials under \
  Z-gradings (for example, for rational polytopes) \
* generalized (or weighted) Ehrhart series and Lebesgue integrals of \
  polynomials over rational polytopes via NmzIntegrate"
LICENSE = "GPL-3.0-or-later"

PV = "3.11.1"

RPM_NAME = "normaliz-3.11.1-1.5.aarch64.rpm"
RPM_HASH = "75e81c07abdd2cca2b9128e8a2ed62f2dc60a57e81c64be194d8753e58a7faa72b45bffe65e765a795c1008765931763acab3d4150caf2478492292c6b26d8eb"

RPROVIDES:${PN} += "normaliz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeanticxx.so.3 \
libgcc-s.so.1 \
libgmp.so.10 \
libnormaliz.so.3 \
libstdc++.so.6"

inherit rpm
