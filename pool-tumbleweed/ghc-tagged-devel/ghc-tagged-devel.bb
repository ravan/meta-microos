SUMMARY = "Haskell tagged library development files"
DESCRIPTION = "This package provides the Haskell tagged library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-tagged-devel-0.8.10-2.3.aarch64.rpm"
RPM_HASH = "8cd9e6c52f609c992bc5e94ffe0b35eea64cdaeb77c26668bf0832b4173c7277c9806b0901ae36f6cbcf33d38dabc68fea5169ae63c5c9f9ed2a9e5b1d60f444"

RPROVIDES:${PN} += "ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-tagged-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-tagged"

inherit rpm
