SUMMARY = "Portable POSIX-compatibility layer"
DESCRIPTION = "This package provides portable implementations of parts of the unix package. \
This package re-exports the unix package when available. When it isn't \
available, portable implementations are used."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.1"

RPM_NAME = "ghc-unix-compat-0.7.4.1-1.9.aarch64.rpm"
RPM_HASH = "c852958c90e7ed2d6503eb438545526a7a81e6683ca9bbe0ad55bcde4fa0d8717e39ef2027396e3209bf2d14b1653c6a6a82fb23bc7fa43ec7984273ac90c0a2"

RPROVIDES:${PN} += "ghc-unix-compat \
libHSunix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn-ghc9.12.4.so"

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
