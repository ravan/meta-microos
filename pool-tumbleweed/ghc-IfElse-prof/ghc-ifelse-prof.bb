SUMMARY = "Haskell IfElse profiling library"
DESCRIPTION = "This package provides the Haskell IfElse profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-prof-0.85-4.19.aarch64.rpm"
RPM_HASH = "ac305748d328888366be4914004d5664c5004e4d2b7abb1ab5aa760d826c731cbb6c07b3b52c8e0ace77f6bf22cc3281ff16ce1cd44e867e5509e263f82da40d"

RPROVIDES:${PN} += "ghc-IfElse-prof \
ghc-prof-IfElse-0.85-2Mr7a1arQJZD9ILoSvSyef"

RDEPENDS:${PN} += "ghc-IfElse-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-mtl-2.3.2-37ef"

inherit rpm
