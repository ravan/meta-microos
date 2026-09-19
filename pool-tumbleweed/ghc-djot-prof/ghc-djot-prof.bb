SUMMARY = "Haskell djot profiling library"
DESCRIPTION = "This package provides the Haskell djot profiling library."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ghc-djot-prof-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "d3f36b5876fe4bd0690342bac4472cdf87705f2a1c1be40400f7167ad556faa7410d13b860969ee743cab16142bdb54b21eba8979a9875d495a9d97e03662e90"

RPROVIDES:${PN} += "ghc-djot-prof \
ghc-prof-djot-0.1.4-544S34r37OfBfrOQhQH0gD"

RDEPENDS:${PN} += "ghc-djot-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23"

inherit rpm
