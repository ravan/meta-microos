SUMMARY = "Types and functions used to represent SGR aspects"
DESCRIPTION = "The 'ANSI' standards refer to the visual style of displaying characters as \
their 'graphic rendition'. The 'ANSI' codes to establish the graphic rendition \
for subsequent text are referred to as SELECT GRAPHIC RENDITION (SGR). \
This package exposes modules that export types and functions used to represent \
SGR aspects."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-ansi-terminal-types-1.1.3-1.10.aarch64.rpm"
RPM_HASH = "41766dea6d038f36866abac0c7ec1f8b84900944c28f702d03df39fac427fed71f128f1c7821b5371bca1723d95298ac79b7c2f43056eac00ef6b64b19cd12aa"

RPROVIDES:${PN} += "ghc-ansi-terminal-types \
libHSansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScolour-2.3.7-LuxtbazHK7IK55ldBice4c-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
