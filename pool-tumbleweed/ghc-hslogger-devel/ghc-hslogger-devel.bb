SUMMARY = "Haskell hslogger library development files"
DESCRIPTION = "This package provides the Haskell hslogger library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.0"

RPM_NAME = "ghc-hslogger-devel-1.3.2.0-1.9.aarch64.rpm"
RPM_HASH = "96a8548cf2c58c8a0850f2e9f6ab540d69d89930749074b8ac224423eee4ab0bd7b60cf3537caffc2ac970fcdfe6a723d4fd68e88c2604302a3ab914a3e6bf1e"

RPROVIDES:${PN} += "ghc-devel-hslogger-1.3.2.0-FAepwGeIaaOK1M8Dko3m8h \
ghc-hslogger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx \
ghc-devel-time-1.14-a7dc \
ghc-devel-unix-2.8.8.0-178a \
ghc-hslogger"

inherit rpm
