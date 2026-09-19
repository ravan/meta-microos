SUMMARY = "Decimal numbers with variable precision"
DESCRIPTION = "A decimal number has an integer mantissa and a negative exponent. The exponent \
can be interpreted as the number of decimal places in the value."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-0.5.2-2.19.aarch64.rpm"
RPM_HASH = "798f55d4807dc9d80b90e416e5457b0edb7e5c87451e8b15453bddb5668d8213fe027120584c714e1cef447eb37096195dbccd2fad687d08ebc2b9172cb64b4c"

RPROVIDES:${PN} += "ghc-Decimal \
libHSDecimal-0.5.2-1UdB985IcTF52sAwbBdCjx-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
