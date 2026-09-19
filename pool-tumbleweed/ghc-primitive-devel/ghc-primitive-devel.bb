SUMMARY = "Haskell primitive library development files"
DESCRIPTION = "This package provides the Haskell primitive library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.0"

RPM_NAME = "ghc-primitive-devel-0.9.1.0-2.3.aarch64.rpm"
RPM_HASH = "6eeb69860569b992abe18ffb46e827e75befb2b4a6b1dd9ee7feb9f4c456cda5219845a2b5557dcc412cc6c04e225f4a7392d886561f2c08821c5c6e4121727c"

RPROVIDES:${PN} += "ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-primitive-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-primitive"

inherit rpm
