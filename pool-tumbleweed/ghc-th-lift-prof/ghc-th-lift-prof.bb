SUMMARY = "Haskell th-lift profiling library"
DESCRIPTION = "This package provides the Haskell th-lift profiling library."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.7"

RPM_NAME = "ghc-th-lift-prof-0.8.7-1.3.aarch64.rpm"
RPM_HASH = "3b603bb8a55185fefc9e992334535de3b08439078543e37505b8db5a6131fe6ff20f42c224ec0a993d5a5c58918e7dce93aafd0c1e203601b676dad38bacb001"

RPROVIDES:${PN} += "ghc-prof-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-th-lift-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-th-lift-devel"

inherit rpm
