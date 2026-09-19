SUMMARY = "Lifted IO operations from the base library"
DESCRIPTION = "'lifted-base' exports IO operations from the base library lifted to any \
instance of 'MonadBase' or 'MonadBaseControl'. \
 \
Note that not all modules from 'base' are converted yet. If you need a lifted \
version of a function from 'base', just ask me to add it or send me a patch. \
 \
The package includes a copy of the 'monad-peel' testsuite written by Anders \
Kaseorg The tests can be performed using 'cabal test'."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-0.2.3.12-8.36.aarch64.rpm"
RPM_HASH = "2a2516f988be5bb5abfa5463c4af6795efba5c7a1fc609347826bb34b40b5a64e73d42ce7bb0cce3d3d2eb15e59755f125681852e0f9469f5c70ae7aff767380"

RPROVIDES:${PN} += "ghc-lifted-base \
libHSlifted-base-0.2.3.12-BonMj4p70Ef8zpL3zVJvsV-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmonad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
