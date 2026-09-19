SUMMARY = "Haskell monad-logger library development files"
DESCRIPTION = "This package provides the Haskell monad-logger library development files."
LICENSE = "MIT"

PV = "0.3.42"

RPM_NAME = "ghc-monad-logger-devel-0.3.42-1.22.aarch64.rpm"
RPM_HASH = "cf71297b66c8c5ec8c7ca06ac7561478faf5ed3d29725c41cc33dfa442d9b9cc213e32f6951277a33388aaa9a9dae84aa3bd58dbc2c21b8ce00f966c8b5ef6fb"

RPROVIDES:${PN} += "ghc-devel-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-monad-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-devel-lifted-base-0.2.3.12-BonMj4p70Ef8zpL3zVJvsV \
ghc-devel-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-devel-monad-loops-0.4.3-DnSFazqaMXyCc2HbLgcz0b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-stm-chans-3.0.0.11-JJwEZlsv6s72G5B5FYXgFK \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-monad-logger"

inherit rpm
