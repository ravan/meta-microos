SUMMARY = "Haskell safe-exceptions library development files"
DESCRIPTION = "This package provides the Haskell safe-exceptions library development \
files."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-devel-0.1.7.4-2.21.aarch64.rpm"
RPM_HASH = "7bc4c38dd450a6f2fc48944d649f9d58680233a36327eface53c1213febfd2eedb8614baec98ea56476a89fa5af3b41356e9ff44379bc42b50602eda53c145e9"

RPROVIDES:${PN} += "ghc-devel-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-safe-exceptions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-safe-exceptions"

inherit rpm
