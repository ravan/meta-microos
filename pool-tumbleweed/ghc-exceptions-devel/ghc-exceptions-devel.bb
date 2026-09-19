SUMMARY = "Haskell exceptions library development files"
DESCRIPTION = "This package provides the Haskell exceptions library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.12"

RPM_NAME = "ghc-exceptions-devel-0.10.12-1.3.aarch64.rpm"
RPM_HASH = "36c09eb781ffcd38bade1e4999618497c1a44c66ed2da40bba611926d6dadad06a1ef4d86aac7a9497ac838a18c54c86f53724eb19b5d104f1561f1a248ba8c1"

RPROVIDES:${PN} += "ghc-devel-exceptions-0.10.12-f655 \
ghc-exceptions-devel \
ghc-exceptions-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-exceptions"

inherit rpm
