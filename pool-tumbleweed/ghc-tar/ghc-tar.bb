SUMMARY = "Reading, writing and manipulating '.tar' archive files"
DESCRIPTION = "This library is for working with ''.tar'' archive files. It can read and write \
a range of common variations of archive format including V7, POSIX USTAR and \
GNU formats. \
 \
It provides support for packing and unpacking portable archives. This makes it \
suitable for distribution but not backup because details like file ownership \
and exact permissions are not preserved. \
 \
It also provides features for random access to archive content using an index."
LICENSE = "BSD-3-Clause"

PV = "0.6.4.0"

RPM_NAME = "ghc-tar-0.6.4.0-4.11.aarch64.rpm"
RPM_HASH = "0507c18f30b93f67a624119f0514713f2486b6887978f9d4dc3db093e8d220e7677024bc1b828e98c804351550b7cadb0e5744e551e7879f121aee95bb92d81c"

RPROVIDES:${PN} += "ghc-tar \
libHStar-0.6.4.0-6dSvxaDgGK790VblyYOhVA-tar-internal-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSatomic-counter-0.1.2.4-K5650WCkbBZIqAcUX7ixZ6-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSdirectory-ospath-streaming-0.2.2-CPCQJecF0zy6ReoJMTKhf9-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
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
