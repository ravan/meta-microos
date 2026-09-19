SUMMARY = "Memory-efficient C++ hash_map implementation"
DESCRIPTION = "The Google SparseHash project contains several C++ template hash-map \
implementations with different performance characteristics, including \
an implementation that optimizes for space and one that optimizes for \
speed."
LICENSE = "BSD-3-Clause"

PV = "2.0.4"

RPM_NAME = "sparsehash-devel-2.0.4-2.2.aarch64.rpm"
RPM_HASH = "32fbc3fdc2aa584e3609b4c67818282143048cca784143c1597b54b81e814b595368e88002c100dae53e8d8d85699b0b78bf50871e61bca26008b4d58aeb7c44"

RPROVIDES:${PN} += "pkgconfig-libsparsehash \
sparsehash-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
