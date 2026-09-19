SUMMARY = "Haskell dlist profiling library"
DESCRIPTION = "This package provides the Haskell dlist profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-prof-1.0-5.16.aarch64.rpm"
RPM_HASH = "89ec869ed73e5d79f62c991cc58bf818f64050a8c076f4bf5004ffbf7d1b3c4c8ca57fcf24c0b4bbb793cfde75185fa2f234dbd4223d6a83e1f1a593a72d3da1"

RPROVIDES:${PN} += "ghc-dlist-prof \
ghc-prof-dlist-1.0-24EafZnoZk8EE7HqnP59eC"

RDEPENDS:${PN} += "ghc-dlist-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350"

inherit rpm
