SUMMARY = "Haskell unix-time profiling library"
DESCRIPTION = "This package provides the Haskell unix-time profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.17"

RPM_NAME = "ghc-unix-time-prof-0.4.17-1.8.aarch64.rpm"
RPM_HASH = "d2d983e42fc20b08507b966e923f2faae9a7245e5ec3cb3fd5d6263ad309868f10077a99180567ce57b0a02c4eabaa5e683f23c17b4da568db932a50c4e0586d"

RPROVIDES:${PN} += "ghc-prof-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q \
ghc-unix-time-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-old-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX \
ghc-unix-time-devel"

inherit rpm
