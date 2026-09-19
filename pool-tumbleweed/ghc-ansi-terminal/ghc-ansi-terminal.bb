SUMMARY = "Simple ANSI terminal support"
DESCRIPTION = "ANSI terminal support for Haskell: allows cursor movement, screen clearing, \
color output, showing or hiding the cursor, and changing the title. \
Works on UNIX and Windows."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "ghc-ansi-terminal-1.1.5-1.7.aarch64.rpm"
RPM_HASH = "5dfa650cd5dfac9d0ccccbfcee27f7e0b10af3e133a8f6eb333a28a395e94af43ad5f1c2f903ca597134a6e9235babaf2d5d3017084a7215b9ef27b8ab149dee"

RPROVIDES:${PN} += "ghc-ansi-terminal \
libHSansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScolour-2.3.7-LuxtbazHK7IK55ldBice4c-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
