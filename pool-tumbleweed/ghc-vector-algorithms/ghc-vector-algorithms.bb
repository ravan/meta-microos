SUMMARY = "Efficient algorithms for vector arrays"
DESCRIPTION = "Efficient algorithms for sorting vector arrays. At some stage other vector \
algorithms may be added."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.0"

RPM_NAME = "ghc-vector-algorithms-0.9.1.0-2.3.aarch64.rpm"
RPM_HASH = "40ca1eef116d5ed5ec1e9c7d2b214a0efe3dedb58fe6ea53360f1b6add345e263a4724640889529a4c6ad6fe37baf41eed98a012a0884a34643354bd9a56c337"

RPROVIDES:${PN} += "ghc-vector-algorithms \
libHSvector-algorithms-0.9.1.0-KRcdYzVzgLOFSifxDHEL6p-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
