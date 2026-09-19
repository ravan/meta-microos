SUMMARY = "Lift computations from the bottom of a transformer stack"
DESCRIPTION = "This package provides a straightforward port of 'monadLib''s BaseM typeclass to \
'transformers'."
LICENSE = "BSD-3-Clause"

PV = "0.4.6.1"

RPM_NAME = "ghc-transformers-base-0.4.6.1-1.3.aarch64.rpm"
RPM_HASH = "931dd7108f40bfcd6a348e386e10a241408440c88129070da75f622cc920a2f24246ce590af0fdda51980e188b5858870067230a01ce8db8d75bdf349ea707e2"

RPROVIDES:${PN} += "ghc-transformers-base \
libHStransformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
