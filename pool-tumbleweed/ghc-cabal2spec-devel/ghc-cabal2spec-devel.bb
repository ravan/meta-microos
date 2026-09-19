SUMMARY = "Haskell cabal2spec library development files"
DESCRIPTION = "This package provides the Haskell cabal2spec library development files."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "ghc-cabal2spec-devel-2.8.0-1.9.aarch64.rpm"
RPM_HASH = "4324aa72b76e1db3b327cfb85ea12f59e3f1297bcd23b9a491310f8d6c1454fde99fd06a02befc70b072fbd8f37d079e1a25cc29b05243fba1b9b839bc4da297"

RPROVIDES:${PN} += "ghc-cabal2spec-devel \
ghc-devel-cabal2spec-2.8.0-31lc3MkVLh81em4v4LNKxo"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal2spec \
ghc-compiler \
ghc-devel-Cabal-3.14.2.0-f8f4 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-time-1.14-a7dc"

inherit rpm
