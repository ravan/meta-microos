SUMMARY = "Haskell directory profiling library"
DESCRIPTION = "This package provides the Haskell directory profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.10.1"

RPM_NAME = "ghc-directory-prof-1.3.10.1-1.3.aarch64.rpm"
RPM_HASH = "e28b581034c4cf427bdc8304daba9b6b5dc3c010071bbe1d548bbb84c45d8737db3987e5848bc8438b34734b75d0d40d81742a95f6a111d45bfece26b88e161b"

RPROVIDES:${PN} += "ghc-directory-prof \
ghc-prof-directory-1.3.10.1-b1d7 \
libHSdirectory-1.3.10.1-b1d7-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-directory-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-file-io-0.1.6-8374 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-os-string-2.0.10-5320 \
ghc-prof-time-1.14-a7dc \
ghc-prof-unix-2.8.8.0-178a \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-p-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-p-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-p-ghc9.12.4.so \
libHSos-string-2.0.10-5320-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHStime-1.14-a7dc-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
