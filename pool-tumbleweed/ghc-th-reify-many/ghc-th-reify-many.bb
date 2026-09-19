SUMMARY = "Recurseively reify template haskell datatype info"
DESCRIPTION = "'th-reify-many' provides functions for recursively reifying top level \
declarations. The main intended use case is for enumerating the names of \
datatypes reachable from an initial datatype, and passing these names to some \
function which generates instances."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-th-reify-many-0.1.10-1.23.aarch64.rpm"
RPM_HASH = "0e5516275de7f80d80df8fc55a06de9fdc9c0d636b2cc81d41d7bd69c4ac959f24c714fd6b7992cd5eb0b601e96fcc1694d2ac17eb9802ef01ba6d335508bd58"

RPROVIDES:${PN} += "ghc-th-reify-many \
libHSth-reify-many-0.1.10-Y1BMkE9L3hAvIhFuDWL0x-ghc9.12.4.so"

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
libHSth-expand-syns-0.4.12.0-2BWsmg9V6mHJNn5DoPUfmz-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
