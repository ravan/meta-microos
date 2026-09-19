SUMMARY = "Haskell indexed-traversable library development files"
DESCRIPTION = "This package provides the Haskell indexed-traversable library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-indexed-traversable-devel-0.1.5-1.3.aarch64.rpm"
RPM_HASH = "85d0283f3e8bb966753aed91da9c012c799e9988332a0166f7032fc5a6bc393110636a362dfc1a57daa37bcff4a03215e5ff4721657921b68fb78ac054cb3764"

RPROVIDES:${PN} += "ghc-devel-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-indexed-traversable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-indexed-traversable"

inherit rpm
