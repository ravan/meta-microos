SUMMARY = "Utilities for indexed profunctors"
DESCRIPTION = "This package contains basic definitions related to indexed profunctors. \
These are primarily intended as internal utilities to support the 'optics' and \
'generic-lens' package families."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-0.1.1.1-1.18.aarch64.rpm"
RPM_HASH = "73842ec76930ffeace57ffec0dbe4957227a27891d64b86e9161977c3da96b77a566cdfac7b9668311c87bb8ee06059b3df87eb13a0135cdc05eed646db3cf94"

RPROVIDES:${PN} += "ghc-indexed-profunctors \
libHSindexed-profunctors-0.1.1.1-HSqEhDrwiQJ27Hm9NjzenO-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
