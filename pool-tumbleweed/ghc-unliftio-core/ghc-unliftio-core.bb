SUMMARY = "The MonadUnliftIO typeclass for unlifting monads to IO"
DESCRIPTION = "Please see the documentation and README at \
<https://www.stackage.org/package/unliftio-core>."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-0.2.1.0-3.23.aarch64.rpm"
RPM_HASH = "5c26bd52e78bfd37a629915abf5bbf6103283dba774092e3a51769f9f1caa0269867ad8ec2eaa757b124e2f7687e8fd59a2e54c8459e9317e8a8bbd7862ada7b"

RPROVIDES:${PN} += "ghc-unliftio-core \
libHSunliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
