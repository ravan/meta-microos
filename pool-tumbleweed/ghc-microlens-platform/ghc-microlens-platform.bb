SUMMARY = "Microlens + all batteries included (best for apps)"
DESCRIPTION = "This package exports a module which is the recommended starting point for using \
<http://hackage.haskell.org/package/microlens microlens> if you aren't trying \
to keep your dependencies minimal. By importing 'Lens.Micro.Platform' you get \
all functions and instances from <http://hackage.haskell.org/package/microlens \
microlens>, <http://hackage.haskell.org/package/microlens-th microlens-th>, \
<http://hackage.haskell.org/package/microlens-mtl microlens-mtl>, \
<http://hackage.haskell.org/package/microlens-ghc microlens-ghc>, as well as \
instances for 'Vector', 'Text', and 'HashMap'. \
 \
The minor and major versions of microlens-platform are incremented whenever the \
minor and major versions of any other microlens package are incremented, so you \
can depend on the exact version of microlens-platform without specifying the \
version of microlens (microlens-mtl, etc) you need. \
 \
This package is a part of the <http://hackage.haskell.org/package/microlens \
microlens> family; see the readme \
<https://github.com/stevenfontanella/microlens#readme on Github>."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.2"

RPM_NAME = "ghc-microlens-platform-0.4.4.2-1.11.aarch64.rpm"
RPM_HASH = "c452685b088565a919d476a761f42287ce96bdafecfd468364f882b99fb0463f2c885fa7c27c9ce8c96a64f92987e8ea81f560a9f5220a667a6b47b630f2fbe5"

RPROVIDES:${PN} += "ghc-microlens-platform \
libHSmicrolens-platform-0.4.4.2-FHpyH8J1vkX1PJSxWPZ8RH-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmicrolens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3-ghc9.12.4.so \
libHSmicrolens-ghc-0.4.15.2-Cj0815upqHk4qg3lDbGmdr-ghc9.12.4.so \
libHSmicrolens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5-ghc9.12.4.so \
libHSmicrolens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
