SUMMARY = "Haskell semigroups library development files"
DESCRIPTION = "This package provides the Haskell semigroups library development files."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "ghc-semigroups-devel-0.20.1-1.3.aarch64.rpm"
RPM_HASH = "59c16b617ddaebb807a0c27139f6028b8fb0d43da29ac1abdab139e290a49949981b78d5f8eb615ad9c20194c23a634a3a0f29fb52d017f84f2dc3308d46ea0b"

RPROVIDES:${PN} += "ghc-devel-semigroups-0.20.1-992KRSDvCsv617GvmRAoMY \
ghc-semigroups-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-semigroups"

inherit rpm
