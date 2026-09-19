SUMMARY = "Lua, an embeddable scripting language"
DESCRIPTION = "This package provides bindings and types to bridge Haskell and \
<https://www.lua.org/ Lua>. \
 \
The full Lua interpreter version 5.4.8 is included. Alternatively, a \
system-wide Lua installation can be linked instead."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "ghc-lua-2.3.4-1.8.aarch64.rpm"
RPM_HASH = "898f0301d8f55a4022d98202d53605db79c6f95b0e4b8f78f4d50daead5022c6db34826347ac0f1adfd7e30cca613acbdc2cb218d3a482aa245072b00087e4ff"

RPROVIDES:${PN} += "ghc-lua \
libHSlua-2.3.4-GxTlN73bN8C8KbBhVEtsew-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
