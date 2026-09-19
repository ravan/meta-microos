SUMMARY = "The MonadUnliftIO typeclass for unlifting monads to IO (batteries included)"
DESCRIPTION = "Please see the documentation and README at \
<https://www.stackage.org/package/unliftio>."
LICENSE = "MIT"

PV = "0.2.25.1"

RPM_NAME = "ghc-unliftio-0.2.25.1-1.12.aarch64.rpm"
RPM_HASH = "2caf2ca474a2463692d21077f6079ab36f9e09168dc32549c2d13223d359f80dd754dfa08b245f410c470e17eb5e422c13d61640a02d633fc56fc07a9045becc"

RPROVIDES:${PN} += "ghc-unliftio \
libHSunliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSasync-2.2.6-4fW0sXrepSt4QxgAnnLVB6-ghc9.12.4.so \
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
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSsafe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
