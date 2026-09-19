SUMMARY = "Haskell hinotify profiling library"
DESCRIPTION = "This package provides the Haskell hinotify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-hinotify-prof-0.4.2-1.13.aarch64.rpm"
RPM_HASH = "210d162e37a6d6e8de15ca2d955b5b757be3bc5bcad44c752955dba11accd7706b81b996522151d5aaed7e780443aa1448d15f43c2ac7e1657ad2f876ed194a6"

RPROVIDES:${PN} += "ghc-hinotify-prof \
ghc-prof-hinotify-0.4.2-4RRzWLCNgXK8AEnEbLT8bd"

RDEPENDS:${PN} += "ghc-hinotify-devel \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
