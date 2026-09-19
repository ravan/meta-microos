SUMMARY = "Haskell uuid-types library development files"
DESCRIPTION = "This package provides the Haskell uuid-types library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.6.1"

RPM_NAME = "ghc-uuid-types-devel-1.0.6.1-1.3.aarch64.rpm"
RPM_HASH = "8518794d56fb40378a19aca14356301b90b44457da681eaeeffb3260baf1e832f9ecbe528507e7c745c62b03851581de6532c43e4a29090c1ccd4b97bdedaffc"

RPROVIDES:${PN} += "ghc-devel-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd \
ghc-uuid-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-uuid-types"

inherit rpm
