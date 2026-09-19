SUMMARY = "A binding to the X11 graphics library"
DESCRIPTION = "A Haskell binding to the X11 graphics library. The binding is a direct \
translation of the C binding; for documentation of these calls, refer to 'The \
Xlib Programming Manual', available online at <http://tronche.com/gui/x/xlib/>."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-1.10.3-5.11.aarch64.rpm"
RPM_HASH = "e0a8d841240db28430c810b73a20845148bd8efc8a8905ad0c49904dfe7b58e2902baab241b69ef1f6c131c909cdb464eccdd903bcd01217b4aaeac04c19917c"

RPROVIDES:${PN} += "ghc-X11 \
libHSX11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdata-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
