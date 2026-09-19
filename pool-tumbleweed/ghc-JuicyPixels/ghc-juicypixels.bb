SUMMARY = "Picture loading/serialization (in png, jpeg, bitmap, gif, tga, tiff and radiance)"
DESCRIPTION = "This library can load and store images in PNG,Bitmap, Jpeg, Radiance, Tiff and \
Gif images."
LICENSE = "BSD-3-Clause"

PV = "3.3.9"

RPM_NAME = "ghc-JuicyPixels-3.3.9-2.3.aarch64.rpm"
RPM_HASH = "78840d8e62d29332830a62638b1c0071cde3971a2ae0896c3922f335010e1c28065ae1e1b5f0226963b1bb56a73156491e56ba75c15141c5793faf94fe151ae3"

RPROVIDES:${PN} += "ghc-JuicyPixels \
libHSJuicyPixels-3.3.9-IB5FNR8B0oDG4pRl7Jn2Mb-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libHSzlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
