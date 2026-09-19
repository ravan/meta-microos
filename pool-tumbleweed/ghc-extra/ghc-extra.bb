SUMMARY = "Extra functions I use"
DESCRIPTION = "A library of extra functions for the standard Haskell libraries. Most functions \
are simple additions, filling out missing functionality. A few functions are \
available in later versions of GHC, but this package makes them available back \
to GHC 7.2. \
 \
The module 'Extra' documents all functions provided by this library. \
Modules such as 'Data.List.Extra' provide extra functions over 'Data.List' and \
also reexport 'Data.List'. Users are recommended to replace 'Data.List' imports \
with 'Data.List.Extra' if they need the extra functionality."
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "ghc-extra-1.8.1-1.7.aarch64.rpm"
RPM_HASH = "4c8300034001c7869ef945cf6c3ff0e5ba3f878b8096611cab0fca8a0643f2bca721c16b7d5a6ef9ed6f1ebd53eaa421d2a168b09b4f3e7e40b04a7bb65b8050"

RPROVIDES:${PN} += "ghc-extra \
libHSextra-1.8.1-J47FlDu75Mb8OlFkJuPlkW-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSclock-0.8.4-Jabd1gSnpD77RKirxFCoTK-ghc9.12.4.so \
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
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
