SUMMARY = "Lift control operations, like exception catching, through monad transformers"
DESCRIPTION = "This package defines the type class 'MonadBaseControl', a subset of 'MonadBase' \
into which generic control operations such as 'catch' can be lifted from 'IO' \
or any other base monad. Instances are based on monad transformers in \
'MonadTransControl', which includes all standard monad transformers in the \
'transformers' library except 'ContT'. \
 \
See the <http://hackage.haskell.org/package/lifted-base lifted-base> package \
which uses 'monad-control' to lift 'IO' operations from the 'base' library \
(like 'catch' or 'bracket') into any monad that is an instance of 'MonadBase' \
or 'MonadBaseControl'. \
 \
Note that this package is a rewrite of Anders Kaseorg's 'monad-peel' library. \
The main difference is that this package provides CPS style operators and \
exploits the 'RankNTypes' and 'TypeFamilies' language extensions to simplify \
and speedup most definitions."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-1.0.3.1-2.24.aarch64.rpm"
RPM_HASH = "312205615fe3af3b3ac4099c8a4ca83d1fd2e8a9fadde9df16c32689105626a2f3a029ee920238fed78068053a73397cfccb6989d8de582fd5177d4dec4eb1cf"

RPROVIDES:${PN} += "ghc-monad-control \
libHSmonad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
