SUMMARY = "Efficient Streams"
DESCRIPTION = "Simple yet powerful monadic streams that are used as a backbone for vector \
package fusion functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-vector-stream-0.1.0.1-5.9.aarch64.rpm"
RPM_HASH = "d8cb05b6f26c0527f46f474f560bec7d5426b9dd6aa7c36b519b16171a9ef72c99ab4972bde8ee9df7353b06cbefa726a309bd4a5cdffb8ec55afd0420fd4954"

RPROVIDES:${PN} += "ghc-vector-stream \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
