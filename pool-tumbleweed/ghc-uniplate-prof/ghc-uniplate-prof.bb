SUMMARY = "Haskell uniplate profiling library"
DESCRIPTION = "This package provides the Haskell uniplate profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-prof-1.6.13-4.44.aarch64.rpm"
RPM_HASH = "f9230289cc65dbe732b5747acec039b09020f160690302eea61734b0c20662cbb7ded9e6df907915cdd066d86e67c22d4fa538d0fa96b9c2483952313e11f06b"

RPROVIDES:${PN} += "ghc-prof-uniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl \
ghc-uniplate-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-uniplate-devel"

inherit rpm
