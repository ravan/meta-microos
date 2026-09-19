SUMMARY = "Bindings for the iw C library"
DESCRIPTION = "A binding to the iw library for getting info about the current WiFi connection."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-0.1.2-4.14.aarch64.rpm"
RPM_HASH = "567e8a7ed233f1974fdde4e66c162451a056a93284dd72a4aea474d236485805bb195e0982d5dad01506fba31fd06d73e71f17817b9a02feeb8da716046162fa"

RPROVIDES:${PN} += "ghc-iwlib \
libHSiwlib-0.1.2-CbOLYXTu5NPFzGiuLS7AmP-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libiw.so.30 \
libm.so.6"

inherit rpm
