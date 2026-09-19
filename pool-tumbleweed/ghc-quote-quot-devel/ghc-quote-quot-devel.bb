SUMMARY = "Haskell quote-quot library development files"
DESCRIPTION = "This package provides the Haskell quote-quot library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-quote-quot-devel-0.2.1.0-1.21.aarch64.rpm"
RPM_HASH = "60b5b4248d40723030e27ec5e55aff1d36e000272686b8439114d36188a0c344cd7c1b13597383881c69ab0d0322d06ef787744775b63284248cc6fcb4671190"

RPROVIDES:${PN} += "ghc-devel-quote-quot-0.2.1.0-8ke8gm9O7CFLkwYR1NwZbK \
ghc-quote-quot-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-quote-quot"

inherit rpm
