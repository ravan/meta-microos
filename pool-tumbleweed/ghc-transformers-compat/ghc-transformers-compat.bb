SUMMARY = "A small compatibility shim for the transformers library"
DESCRIPTION = "This package includes backported versions of types that were added to \
transformers in transformers 0.3, 0.4, and 0.5 for users who need strict \
transformers 0.2 or 0.3 compatibility to run on old versions of the platform, \
but also need those types. \
 \
Those users should be able to just depend on 'transformers >= 0.2' and \
'transformers-compat >= 0.3'. \
 \
Note: missing methods are not supplied, but this at least permits the types to \
be used."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-0.7.2-2.35.aarch64.rpm"
RPM_HASH = "98a5d4c6f5164218f59416233ee2437fae5d70278c5f2b6b834febfbef1ad616164d8e49a9a93d53374b9b9ae3d3fb9d82ec293868c8fa8bea48e3fdd601d539"

RPROVIDES:${PN} += "ghc-transformers-compat \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
