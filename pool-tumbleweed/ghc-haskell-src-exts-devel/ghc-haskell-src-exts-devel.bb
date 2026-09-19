SUMMARY = "Haskell haskell-src-exts library development files"
DESCRIPTION = "This package provides the Haskell haskell-src-exts library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.23.1"

RPM_NAME = "ghc-haskell-src-exts-devel-1.23.1-1.14.aarch64.rpm"
RPM_HASH = "e9771ea4442d49e6743433009814fd3ebd20848da0c92ad30a0d2e8990dcaae22e8d063a302ae030093068f5ef2dc5ec6496a0b277932da93fd2daba2a7329be"

RPROVIDES:${PN} += "ghc-devel-haskell-src-exts-1.23.1-2QXJ6YmpNBDADgPssiT27j \
ghc-haskell-src-exts-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-haskell-src-exts"

inherit rpm
