SUMMARY = "Orphan instances for TH datatypes"
DESCRIPTION = "Orphan instances for TH datatypes. In particular, instances for Ord and Lift, \
as well as a few missing Show / Eq. These instances used to live in \
haskell-src-meta, and that's where the version number started."
LICENSE = "BSD-3-Clause"

PV = "0.13.17"

RPM_NAME = "ghc-th-orphans-0.13.17-1.3.aarch64.rpm"
RPM_HASH = "80d6bf41aca89e39b5002bb2e1e9fc38d773d80679150d9404aab5b05ccef49802af08c9c09f6399d82636e5a0abae15ca0451a2884ba738035b1725c209d0e0"

RPROVIDES:${PN} += "ghc-th-orphans \
libHSth-orphans-0.13.17-JrR2fnTKxP4E1CBKEHbpQ2-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsafe-0.3.21-AzRUUYeJ47sQc55olWnva-ghc9.12.4.so \
libHSsyb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHSth-expand-syns-0.4.12.0-2BWsmg9V6mHJNn5DoPUfmz-ghc9.12.4.so \
libHSth-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc-ghc9.12.4.so \
libHSth-reify-many-0.1.10-Y1BMkE9L3hAvIhFuDWL0x-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
