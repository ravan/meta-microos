SUMMARY = "Haskell cryptohash-sha256 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-devel-0.11.102.1-7.15.aarch64.rpm"
RPM_HASH = "f0a43ac0f5a6d07627d5da258e3896070d728b4a7d0f3b6f2e88cd20afe67d895a51c39ad583ca1cf199486915700cda568fb234a7fbd3c074300fb7da3b06b5"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-devel \
ghc-devel-cryptohash-sha256-0.11.102.1-23ttH0Xv2YGR2bm1AVxTX"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptohash-sha256 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
