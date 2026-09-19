SUMMARY = "A library for simple INI-based configuration files"
DESCRIPTION = "The 'config-ini' library is a set of small monadic languages for writing simple \
configuration languages with convenient, human-readable error messages. \
 \
> parseConfig :: IniParser (Text, Int, Bool) > parseConfig = section 'NETWORK' \
$ do > user <- field 'user' > port <- fieldOf 'port' number > enc <- \
fieldFlagDef 'encryption' True > return (user, port, enc)."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.0"

RPM_NAME = "ghc-config-ini-0.2.7.0-2.32.aarch64.rpm"
RPM_HASH = "5a13d928e31e0e48568600a6884fa608237726c9ee657c99d6a5a83fc1985bc422b1f036d91978c883b9948221b1dcf4dc98abe2e7f6f547389d0aeee8c976ef"

RPROVIDES:${PN} += "ghc-config-ini \
libHSconfig-ini-0.2.7.0-7oGnb0uYOjJ1nTfrjTJt8v-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScase-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC-ghc9.12.4.so \
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
libHSmegaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSscientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
