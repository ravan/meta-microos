SUMMARY = "Haskell mlkem library development files"
DESCRIPTION = "This package provides the Haskell mlkem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-mlkem-devel-0.2.1.0-1.3.aarch64.rpm"
RPM_HASH = "baa2be34e1ce83adc90455b0d52147eb54558f29099f08483852633f8c2ce1b728b06b4eaa34b03d237239284f57b13f411a61e6d4285b164fe29522fcbc4a33"

RPROVIDES:${PN} += "ghc-devel-mlkem-0.2.1.0-I3LOwjV1LZnU6D8hY2Ok5 \
ghc-mlkem-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-mlkem"

inherit rpm
