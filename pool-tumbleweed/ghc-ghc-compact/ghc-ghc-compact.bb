SUMMARY = "Haskell ghc-compact library"
DESCRIPTION = "This package provides the Haskell ghc-compact library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-0.1.0.0-1.3.aarch64.rpm"
RPM_HASH = "3dbb5b997dddb909f52d4d7c0bb6c919ef3acb99fceed1e344f7ac3eff11e84fc46444374c12b028d4b3db91edd6c8761541b086bc6bca0228ccdb7ce265f629"

RPROVIDES:${PN} += "ghc-ghc-compact \
libHSghc-compact-0.1.0.0-bdec-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
