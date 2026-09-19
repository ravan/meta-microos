SUMMARY = "Compatibile module for time-format locale"
DESCRIPTION = "This package contains wrapped name module for time-format locale between \
old-locale and time-1.5."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-0.1.1.5-7.23.aarch64.rpm"
RPM_HASH = "acdb96fa9b6174319de2f017b0513a672472f1b51e4ccad4f1844fe8e80a1a1f5dc909c4cf47995adf6de919f875a548f52fde49f9db28c3f83aa1b63d5c1820"

RPROVIDES:${PN} += "ghc-time-locale-compat \
libHStime-locale-compat-0.1.1.5-9vdyA9EPu1IDeF7oXoCWqM-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
