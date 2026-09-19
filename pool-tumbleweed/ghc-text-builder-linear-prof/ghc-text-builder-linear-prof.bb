SUMMARY = "Haskell text-builder-linear profiling library"
DESCRIPTION = "This package provides the Haskell text-builder-linear profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-text-builder-linear-prof-0.1.3-1.20.aarch64.rpm"
RPM_HASH = "6d453990d5f6b6e21e15570bfa9b13bc5e44813b188dff14885ed1e63ff55838c7072d0d185db756535444394ab67b9ae594b440c70cddc770be4e291f942df4"

RPROVIDES:${PN} += "ghc-prof-text-builder-linear-0.1.3-2ecVyAm1DTtJbSvV9ASpSh \
ghc-text-builder-linear-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-ghc-bignum-1.3-03b0 \
ghc-prof-quote-quot-0.2.1.0-8ke8gm9O7CFLkwYR1NwZbK \
ghc-prof-text-2.1.4-cf23 \
ghc-text-builder-linear-devel"

inherit rpm
