SUMMARY = "Haskell unicode-collation profiling library"
DESCRIPTION = "This package provides the Haskell unicode-collation profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.7"

RPM_NAME = "ghc-unicode-collation-prof-0.1.3.7-1.3.aarch64.rpm"
RPM_HASH = "1180c9fc440d4fd1d9858bdb732ec528953ead67513a988685d8ee2d4e7ac0f9ce8a3c3515f61eebb295decea5a65cc486aa5a9e138833a65f566fa0a15e2d0a"

RPROVIDES:${PN} += "ghc-prof-unicode-collation-0.1.3.7-15abqneWG6p19BxNVdLS7C \
ghc-unicode-collation-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-th-lift-instances-0.1.20-A0nCC2bmuVRHGZj0nSUeyw \
ghc-unicode-collation-devel"

inherit rpm
