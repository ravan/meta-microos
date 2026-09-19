SUMMARY = "Pattern synonyms for ASCII characters for Word8, Word16 etc"
DESCRIPTION = "Pattern synonyms for ASCII characters, e.g. \
 \
' pattern SPACE :: Word8 pattern SPACE = 0x20 '."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-character-ps-0.1-1.17.aarch64.rpm"
RPM_HASH = "92b2599321dd86c18b3d0bef03d4d46c1ebcda922a7795e7a4706f5f9e447c06849a7f8c1c1afc8a63778030114377d6273811fe4aed9c1bc48e3577a5382abe"

RPROVIDES:${PN} += "ghc-character-ps \
libHScharacter-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
