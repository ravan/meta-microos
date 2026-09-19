SUMMARY = "Haskell uniplate library development files"
DESCRIPTION = "This package provides the Haskell uniplate library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-devel-1.6.13-4.44.aarch64.rpm"
RPM_HASH = "67b0391177b284f6fd50f26eaf47ee9a7069350bf246b6c75f4bb62c6a875acc48ca64974d7b1d3286ca97f2f45ce6fd3d097777f938a879983dced7db0cb317"

RPROVIDES:${PN} += "ghc-devel-uniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl \
ghc-uniplate-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-uniplate"

inherit rpm
