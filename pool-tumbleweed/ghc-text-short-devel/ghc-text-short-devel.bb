SUMMARY = "Haskell text-short library development files"
DESCRIPTION = "This package provides the Haskell text-short library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.6.1"

RPM_NAME = "ghc-text-short-devel-0.1.6.1-1.3.aarch64.rpm"
RPM_HASH = "22a3fd4beb9283ab28d5126f73f5336d0cb12de8fdfb5e755f31d5376246db07a3f9060f1747ccce7f648a2daec77bd4c79fd2bde1881c4f759d53ba5649f57c"

RPROVIDES:${PN} += "ghc-devel-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq \
ghc-text-short-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-text-short"

inherit rpm
