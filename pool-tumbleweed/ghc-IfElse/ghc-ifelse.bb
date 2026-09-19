SUMMARY = "Anaphoric and miscellaneous useful control-flow"
DESCRIPTION = "Anaphoric and miscellaneous useful control-flow."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-0.85-4.19.aarch64.rpm"
RPM_HASH = "a59df205eafbcd4bab9c0d163b6fb6ecab5689769388d6fa6894a8a3c3460a71e4c000c8011f97f3c54574775dfbad4469dc4dda8050227f63513cfe119ea5ae"

RPROVIDES:${PN} += "ghc-IfElse \
libHSIfElse-0.85-2Mr7a1arQJZD9ILoSvSyef-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
