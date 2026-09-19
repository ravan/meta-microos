SUMMARY = "Library of safe (exception free) functions"
DESCRIPTION = "A library wrapping 'Prelude'/'Data.List' functions that can throw exceptions, \
such as 'head' and '!!'. Each unsafe function has up to four variants, e.g. \
with 'tail': \
 \
* 'tail :: [a] -> [a]', raises an error on 'tail []'. \
 \
* 'tailMay :: [a] -> /Maybe/ [a]', turns errors into 'Nothing'. \
 \
* 'tailDef :: /[a]/ -> [a] -> [a]', takes a default to return on errors. \
 \
* 'tailNote :: /String/ -> [a] -> [a]', takes an extra argument which \
supplements the error message. \
 \
* 'tailSafe :: [a] -> [a]', returns some sensible default if possible, '[]' in \
the case of 'tail'. \
 \
This package is divided into three modules: \
 \
* 'Safe' contains safe variants of 'Prelude' and 'Data.List' functions. \
 \
* 'Safe.Foldable' contains safe variants of 'Foldable' functions. \
 \
* 'Safe.Exact' creates crashing versions of functions like 'zip' (errors if the \
lists are not equal) and 'take' (errors if there are not enough elements), then \
wraps them to provide safe variants."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "ghc-safe-0.3.21-2.25.aarch64.rpm"
RPM_HASH = "79e5694b44b0b31ad6fa6ae612166cd572d55547e5f3d494416bd3ed675b3b18f1f8579782e5f53f65203d9907f683c0fe7d2003c9576a382cedb6b8947c5854"

RPROVIDES:${PN} += "ghc-safe \
libHSsafe-0.3.21-AzRUUYeJ47sQc55olWnva-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
