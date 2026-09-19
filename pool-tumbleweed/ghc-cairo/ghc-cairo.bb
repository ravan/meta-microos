SUMMARY = "Binding to the Cairo library"
DESCRIPTION = "Cairo is a library to render high quality vector graphics. There exist various \
backends that allows rendering to Gtk windows, PDF, PS, PNG and SVG documents, \
amongst others."
LICENSE = "BSD-3-Clause"

PV = "0.13.12.0"

RPM_NAME = "ghc-cairo-0.13.12.0-1.12.aarch64.rpm"
RPM_HASH = "e6e381d980d63c385cbab51aca673a745da66d8b71a8c320e856568770b624cef9b71cec3ff6579dead84dfaba87be99e5041a54d7295ca3b0f40498521f3cf3"

RPROVIDES:${PN} += "ghc-cairo \
libHScairo-0.13.12.0-4t6EsC3Gqxb9Xow3SHIyd2-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libc.so.6 \
libcairo.so.2 \
libgmp.so.10 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
