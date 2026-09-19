SUMMARY = "Community-maintained extensions for xmonad"
DESCRIPTION = "Community-maintained tiling algorithms and extension modules for xmonad, an X11 \
tiling window manager. \
 \
For an introduction to building, configuring and using xmonad extensions, see \
'XMonad.Doc'. In particular: \
 \
'XMonad.Doc.Configuring', a guide to configuring xmonad \
 \
'XMonad.Doc.Extending', using the contributed extensions library \
 \
'XMonad.Doc.Developing', introduction to xmonad internals and writing your own \
extensions."
LICENSE = "BSD-3-Clause"

PV = "0.18.2"

RPM_NAME = "ghc-xmonad-contrib-0.18.2-1.3.aarch64.rpm"
RPM_HASH = "98f73e593b8c9a3e64ac1ed8f0f64351beaa2c16380432826e5e9496a6ae978c76add9b7353e02812e0d65cab9a41f888c28333bcd5cbdff356158b19e402e0c"

RPROVIDES:${PN} += "ghc-xmonad-contrib \
libHSxmonad-contrib-0.18.2-7mXB0q6IEmXBaWH27GMzuc-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSX11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk-ghc9.12.4.so \
libHSX11-xft-0.3.4-C3us4A75PM8AtwtgFqRfgr-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdata-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSsetlocale-1.0.0.10-1AxYf6FKOpjAmPtKjx6N4K-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libHSxmonad-0.18.1-92DX9BCe4RIB8NiPfjJWdp-ghc9.12.4.so \
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
