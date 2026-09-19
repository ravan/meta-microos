SUMMARY = "A Setup.hs helper for running doctests"
DESCRIPTION = "As of now (end of 2024), there isn't 'cabal doctest' command. Yet, to properly \
work, 'doctest' needs plenty of configuration. This library provides the common \
bits for writing a custom 'Setup.hs'."
LICENSE = "BSD-3-Clause"

PV = "1.0.12"

RPM_NAME = "ghc-cabal-doctest-1.0.12-2.3.aarch64.rpm"
RPM_HASH = "93fbcd208e2b0f2b86b0385f0e7761e6bcba40a27046cfdb8a0f79ca75ed8e2396c61d256fe58e2087175c2ffa77b4d18038f8c9a791117cc2c1f7ba5e42ef58"

RPROVIDES:${PN} += "ghc-cabal-doctest \
libHScabal-doctest-1.0.12-9BatbH3Akyg7qG3sD8QDn0-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSCabal-3.14.2.0-f8f4-ghc9.12.4.so \
libHSCabal-syntax-3.14.2.0-5c2f-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
