SUMMARY = "Haskell th-expand-syns profiling library"
DESCRIPTION = "This package provides the Haskell th-expand-syns profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.12.0"

RPM_NAME = "ghc-th-expand-syns-prof-0.4.12.0-2.3.aarch64.rpm"
RPM_HASH = "2e7f8f00d2b9ecdd44ba888f8723d9471e19ac94e99fd46c1eaa4b87316701e29b1b9c2cb6d166291725baa5eb94389f40f11e6360d055dc224c59c2e430b9f5"

RPROVIDES:${PN} += "ghc-prof-th-expand-syns-0.4.12.0-2BWsmg9V6mHJNn5DoPUfmz \
ghc-th-expand-syns-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-th-expand-syns-devel"

inherit rpm
