SUMMARY = "Access Unicode Character Database (UCD)"
DESCRIPTION = "'unicode-data' provides Haskell APIs to efficiently access the \
<https://www.unicode.org/ucd/ Unicode character database> (UCD). \
Performance is the primary goal in the design of this package. \
 \
The Haskell data structures are generated programmatically from the UCD files. \
The latest Unicode version supported by this library is \
'<https://www.unicode.org/versions/Unicode15.1.0/ 15.1.0>'."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "ghc-unicode-data-0.6.0-1.16.aarch64.rpm"
RPM_HASH = "20a2e1e1d6a65cf7fa4b9f20944213fd525b32f716a495bc03f1642316f195da56b7ee6cd88a4c00bb017c550f26718f28d62042d5740f5c30b2dd4b1d3a780a"

RPROVIDES:${PN} += "ghc-unicode-data \
libHSunicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
