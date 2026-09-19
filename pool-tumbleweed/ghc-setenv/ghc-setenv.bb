SUMMARY = "A cross-platform library for setting environment variables"
DESCRIPTION = "A cross-platform library for setting environment variables \
 \
Note: Since 'base-4.7.0.0' the functions 'setEnv' and 'unsetEnv' are provided \
by 'System.Environment'. 'System.SetEnv' merily re-exports those functions when \
built with 'base >= 4.7'."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-0.1.1.3-12.23.aarch64.rpm"
RPM_HASH = "e56e25bd957d507d0532b27795245e6845e166b2a74576fb7e05e90578f869e8fc9794421b7a3474a9a79b94cca3df4ba86e765dd1ec885ba93c50f5a8da6dcd"

RPROVIDES:${PN} += "ghc-setenv \
libHSsetenv-0.1.1.3-DGkCIo7XRqzD68Dz6COumh-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
