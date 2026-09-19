SUMMARY = "Haskell template-haskell library development files"
DESCRIPTION = "This package provides the Haskell template-haskell library development files."
LICENSE = "BSD-3-Clause"

PV = "2.23.0.0"

RPM_NAME = "ghc-template-haskell-devel-2.23.0.0-1.3.aarch64.rpm"
RPM_HASH = "01f5c85f0b82bb0256c2cf846e12db6963acf32bf8c738b4e0ed7400b59b75a72b6193609d5f87148fe2411249b0f7d4cbf4ff29bc992b2c1229a4469b44d26a"

RPROVIDES:${PN} += "ghc-devel-template-haskell-2.23.0.0-358a \
ghc-template-haskell-devel \
ghc-template-haskell-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-boot-th-9.12.4-0605 \
ghc-devel-ghc-internal-9.1204.0-f1e1 \
ghc-template-haskell"

inherit rpm
