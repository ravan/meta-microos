SUMMARY = "Haskell cmdargs profiling library"
DESCRIPTION = "This package provides the Haskell cmdargs profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-prof-0.10.22-1.35.aarch64.rpm"
RPM_HASH = "7bd8fca9a83b699926036f79b74f3dc09299e17a0b17e54df250d09a180ebfe646ef3f5c034cbec810d70973a095f3b94fc8ca1756486e4af1cb33bb2baf181a"

RPROVIDES:${PN} += "ghc-cmdargs-prof \
ghc-prof-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg"

RDEPENDS:${PN} += "ghc-cmdargs-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
