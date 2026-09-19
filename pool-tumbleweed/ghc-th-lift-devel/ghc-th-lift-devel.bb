SUMMARY = "Haskell th-lift library development files"
DESCRIPTION = "This package provides the Haskell th-lift library development files."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.7"

RPM_NAME = "ghc-th-lift-devel-0.8.7-1.3.aarch64.rpm"
RPM_HASH = "2ee6335725aee9e95de41dd5d37bb7f11cce90994610b566308c5476448824c908cc5a27c0bd6d82a99365d9b17f8446daa8df4474bd871f2027a16a231270e1"

RPROVIDES:${PN} += "ghc-devel-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-th-lift-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-th-lift"

inherit rpm
