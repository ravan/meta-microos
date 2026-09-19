SUMMARY = "Unicode alternatives for common functions and operators"
DESCRIPTION = "This package defines new symbols for a number of functions, operators and types \
in the base package. \
 \
All symbols are documented with their actual definition and information \
regarding their Unicode code point. They should be completely interchangeable \
with their definitions. \
 \
For further Unicode goodness you can enable the 'UnicodeSyntax' language \
extension [1]. This extension enables Unicode characters to be used to stand \
for certain ASCII character sequences, i.e. &#x2192; instead of '->', &#x2200; \
instead of 'forall' and many others. \
 \
Original idea by P&#xE9;ter Divi&#xE1;nszky. \
 \
[1] \
<https://downloads.haskell.org/~ghc/latest/docs/html/users_guide/glasgow_exts.html#unicode-syntax>."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-0.2.4.2-1.23.aarch64.rpm"
RPM_HASH = "8421a607fc6b0a68d39681dd7df6bc9ae5e7ba31e4a910522d91b3a14304e712f87f2f9a1527eb908e0a8004c92de974c28ae4446c31a84b7ff82d39c21bd10a"

RPROVIDES:${PN} += "ghc-base-unicode-symbols \
libHSbase-unicode-symbols-0.2.4.2-EOprbUpnIOv3U10zkWCZPk-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
