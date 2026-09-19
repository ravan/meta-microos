SUMMARY = "Haskell semigroups profiling library"
DESCRIPTION = "This package provides the Haskell semigroups profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "ghc-semigroups-prof-0.20.1-1.3.aarch64.rpm"
RPM_HASH = "289974e8b8a1797a9e338a302a84a90e5286ec20d483d8976221461d04b1456df9e64546620fcac4c5d26e81478ee681bae0844595516198f998de71befed6e6"

RPROVIDES:${PN} += "ghc-prof-semigroups-0.20.1-992KRSDvCsv617GvmRAoMY \
ghc-semigroups-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-semigroups-devel"

inherit rpm
