SUMMARY = "Haskell string/text/bytestring interpolation that just works"
DESCRIPTION = "Unicode-aware string interpolation that handles all textual types. \
 \
See the README at \
<https://gitlab.com/williamyaoh/string-interpolate/blob/master/README.md> for \
more info."
LICENSE = "BSD-3-Clause"

PV = "0.3.4.0"

RPM_NAME = "ghc-string-interpolate-0.3.4.0-5.2.aarch64.rpm"
RPM_HASH = "09cb25219e593f3ccd0a46a95800c59e7255dcc66e94081694843705d554e7c8cc3cf093821124904d74454f64872d158b526d172d1793703e920e2286e6a51e"

RPROVIDES:${PN} += "ghc-string-interpolate \
libHSstring-interpolate-0.3.4.0-33oQtZOJbICXcczDMt7VE-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL-ghc9.12.4.so \
libHSbase64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShaskell-src-exts-1.23.1-2QXJ6YmpNBDADgPssiT27j-ghc9.12.4.so \
libHShaskell-src-meta-0.8.15-FnQqpPy0mwl8lKE5H2GQu6-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsafe-0.3.21-AzRUUYeJ47sQc55olWnva-ghc9.12.4.so \
libHSsplit-0.2.5-DF0qBqNymX3Hv5Ta0307xc-ghc9.12.4.so \
libHSsyb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStext-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHSth-expand-syns-0.4.12.0-2BWsmg9V6mHJNn5DoPUfmz-ghc9.12.4.so \
libHSth-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc-ghc9.12.4.so \
libHSth-orphans-0.13.17-JrR2fnTKxP4E1CBKEHbpQ2-ghc9.12.4.so \
libHSth-reify-many-0.1.10-Y1BMkE9L3hAvIhFuDWL0x-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
