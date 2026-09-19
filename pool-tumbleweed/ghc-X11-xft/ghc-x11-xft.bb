SUMMARY = "Bindings to the Xft and some Xrender parts"
DESCRIPTION = "A Haskell bindings to the X Font library. With it, Haskell X11 applications can \
access high quality font renderings and provide fonts with anti-aliasing and \
subpixel rendering. The bindings also provide minimal bindings to Xrender \
parts."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-0.3.4-2.21.aarch64.rpm"
RPM_HASH = "b0278b521da26fd2b3486063bd8a54c4ced958bd2e221359b320a218d0908a7c0f06a597320b8b082514b45ba533e585ef2218f37b8ed33ee82f20647c98a828"

RPROVIDES:${PN} += "ghc-X11-xft \
libHSX11-xft-0.3.4-C3us4A75PM8AtwtgFqRfgr-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSX11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
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
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
