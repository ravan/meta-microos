SUMMARY = "Haskell monad-logger profiling library"
DESCRIPTION = "This package provides the Haskell monad-logger profiling library."
LICENSE = "MIT"

PV = "0.3.42"

RPM_NAME = "ghc-monad-logger-prof-0.3.42-1.22.aarch64.rpm"
RPM_HASH = "930fd1d606a31a4f279567d789a4ee063bfd47ad440aa5f4a0ffc36db53956c84b3d51df542b530752f6b58494b6b574a515ca5843145d7c049b594a9c398fda"

RPROVIDES:${PN} += "ghc-monad-logger-prof \
ghc-prof-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG"

RDEPENDS:${PN} += "ghc-monad-logger-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-prof-lifted-base-0.2.3.12-BonMj4p70Ef8zpL3zVJvsV \
ghc-prof-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-prof-monad-loops-0.4.3-DnSFazqaMXyCc2HbLgcz0b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-stm-chans-3.0.0.11-JJwEZlsv6s72G5B5FYXgFK \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92"

inherit rpm
