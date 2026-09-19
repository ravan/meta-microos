SUMMARY = "Haskell HUnit profiling library"
DESCRIPTION = "This package provides the Haskell HUnit profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-prof-1.6.2.0-2.35.aarch64.rpm"
RPM_HASH = "eec815fac49b61798fe18afd834fcc756a9c7e067918c0da0a414ade70de3e53b886e341accd8eb69f17f5518da71904afdb51ef86500606c07e56467d2bc769"

RPROVIDES:${PN} += "ghc-HUnit-prof \
ghc-prof-HUnit-1.6.2.0-HyPyPtOZKKe7vLdGCWHz7V"

RDEPENDS:${PN} += "ghc-HUnit-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-prof-deepseq-1.5.1.0-1350"

inherit rpm
