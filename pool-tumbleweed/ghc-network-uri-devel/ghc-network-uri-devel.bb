SUMMARY = "Haskell network-uri library development files"
DESCRIPTION = "This package provides the Haskell network-uri library development files."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-devel-2.6.4.2-3.29.aarch64.rpm"
RPM_HASH = "6c696e59d7d2599bb4a5c1c9491cd6c21dd53df8400207622832ed7db6a18d003946ca804277922e1f2ea7e6b3421bf678e34057c4494e80aaa61ef625eb433a"

RPROVIDES:${PN} += "ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-network-uri-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp \
ghc-network-uri"

inherit rpm
