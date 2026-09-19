SUMMARY = "Additional types of channels for STM"
DESCRIPTION = "Additional types of channels for STM."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.11"

RPM_NAME = "ghc-stm-chans-3.0.0.11-1.3.aarch64.rpm"
RPM_HASH = "c7fea004ecbc8be297bcedff4352dd3c4ad8a9839c365842c2c8fa6e1fe067105585ec8e365d86ea549d2c37e61cde2abe65b2fb3c6767316e4fe24bca55f082"

RPROVIDES:${PN} += "ghc-stm-chans \
libHSstm-chans-3.0.0.11-JJwEZlsv6s72G5B5FYXgFK-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
