SUMMARY = "Get terminal window height and width"
DESCRIPTION = "Get terminal window height and width without ncurses dependency."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-0.3.4-2.16.aarch64.rpm"
RPM_HASH = "1099dd2f05b9af450cc0b3ce473707e01dafb00747c633ce338935f7f87a914b86219639eb40e28305a03b20a66d13dadc19e6bd8ad9d3cbe222d2965d1ba9ae"

RPROVIDES:${PN} += "ghc-terminal-size \
libHSterminal-size-0.3.4-KpiFCzVajgTH7fY18MNMyf-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
