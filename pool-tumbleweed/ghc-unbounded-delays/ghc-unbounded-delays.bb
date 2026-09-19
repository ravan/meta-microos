SUMMARY = "Unbounded thread delays and timeouts"
DESCRIPTION = "The 'threadDelay' and 'timeout' functions from the 'base' library use the \
bounded 'Int' type for specifying the delay or timeout period. This packages \
provides alternatives which use the unbounded 'Integer' type."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-unbounded-delays-0.1.1.1-1.34.aarch64.rpm"
RPM_HASH = "f4563031cac12ba32ba26ff60a398967fea18cdf85cd3cbbd42aec5e4ee27da66114df24d578bce1c3c24c991df87951c271524b91c592f01cec34a808734a2b"

RPROVIDES:${PN} += "ghc-unbounded-delays \
libHSunbounded-delays-0.1.1.1-GOtUGVFNnY3FmbBooyj2xV-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
