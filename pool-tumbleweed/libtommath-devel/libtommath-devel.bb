SUMMARY = "Development files for LibTomMath"
DESCRIPTION = "Headers and other development files for TomMath library. \
 \
LibTomMath provides highly optimized and portable routines for a vast \
majority of integer based number theoretic applications (including public \
key cryptography). LibTomMath is not a cryptographic toolkit itself but it \
can be used to write one [Used in LibTomCrypt for RSA, DH and ECC public key \
routines]."
LICENSE = "Unlicense"

PV = "1.3.0"

RPM_NAME = "libtommath-devel-1.3.0-1.9.aarch64.rpm"
RPM_HASH = "f1879958adb2f25f7dfcfe9b013c6650bcdecbbbc5bbc55920b999f37f1d21f7a576f9d01db021e31f36a2f890be148e06df57b4f63c2d0c0baf7a0f5e382a76"

RPROVIDES:${PN} += "libtommath-devel \
libtommath0-devel \
pkgconfig-libtommath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtommath1"

inherit rpm
