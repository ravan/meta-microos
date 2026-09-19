SUMMARY = "Generically newtype to use with DerivingVia"
DESCRIPTION = "This is a compatibility package as 'Generically' and 'Generically1' newtypes \
are available since 'base-4.17' in 'GHC.Generics'."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-0.1.1-6.3.aarch64.rpm"
RPM_HASH = "825ca02a751c027b949450846ea81f72e5dc314d422ac30e1bfa46be64e105dbeddb9c14042865d256d2c414eecaba2209c76afff1bdf25cc2bfca5a3913ceb0"

RPROVIDES:${PN} += "ghc-generically \
libHSgenerically-0.1.1-KFVlHRUBXRKIFuvobfIRlH-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
