SUMMARY = "Haskell reflection library development files"
DESCRIPTION = "This package provides the Haskell reflection library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "ghc-reflection-devel-2.1.9-2.12.aarch64.rpm"
RPM_HASH = "23cf88135aab90b1aeb0cd76bd4c999cf8e883971e23bbe8a40886be30711336cba04299cbadb7e652698fd34fe99688fa12d7d714753ba2906c29e15f220fcc"

RPROVIDES:${PN} += "ghc-devel-reflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF \
ghc-reflection-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-reflection"

inherit rpm
