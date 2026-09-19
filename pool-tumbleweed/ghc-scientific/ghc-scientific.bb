SUMMARY = "Numbers represented using scientific notation"
DESCRIPTION = "'Data.Scientific' provides the number type 'Scientific'. Scientific numbers are \
arbitrary precision and space efficient. They are represented using \
<http://en.wikipedia.org/wiki/Scientific_notation scientific notation>. \
The implementation uses a coefficient 'c :: 'Integer'' and a base-10 exponent \
'e :: 'Int''. A scientific number corresponds to the 'Fractional' number: \
''fromInteger' c * 10 '^^' e'. \
 \
Note that since we're using an 'Int' to represent the exponent these numbers \
aren't truly arbitrary precision. I intend to change the type of the exponent \
to 'Integer' in a future release. \
 \
The main application of 'Scientific' is to be used as the target of parsing \
arbitrary precision numbers coming from an untrusted source. The advantages \
over using 'Rational' for this are that: \
 \
* A 'Scientific' is more efficient to construct. Rational numbers need to be \
constructed using '%' which has to compute the 'gcd' of the 'numerator' and \
'denominator'. \
 \
* 'Scientific' is safe against numbers with huge exponents. For example: \
'1e1000000000 :: 'Rational'' will fill up all space and crash your program. \
Scientific works as expected: \
 \
>>> read '1e1000000000' :: Scientific 1.0e1000000000 \
 \
* Also, the space usage of converting scientific numbers with huge exponents to \
''Integral's' (like: 'Int') or ''RealFloat's' (like: 'Double' or 'Float') will \
always be bounded by the target type."
LICENSE = "BSD-3-Clause"

PV = "0.3.8.1"

RPM_NAME = "ghc-scientific-0.3.8.1-1.3.aarch64.rpm"
RPM_HASH = "cca7201d4ec22217df50bbd66b335bc40aaa9e7c6f12fdfceec9e4695c2fcc9a11bc6b515ed2dd9f8f0ec20adf25fd6f5ac2c4947df67419058d86bad5e66029"

RPROVIDES:${PN} += "ghc-scientific \
libHSscientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSinteger-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
