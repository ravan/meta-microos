SUMMARY = "Example files for LibTomMath"
DESCRIPTION = "Demo *.c files showing how to use TomMath library. \
 \
LibTomMath provides highly optimized and portable routines for a vast \
majority of integer based number theoretic applications (including public \
key cryptography). LibTomMath is not a cryptographic toolkit itself but it \
can be used to write one [Used in LibTomCrypt for RSA, DH and ECC public key \
routines]."
LICENSE = "Unlicense"

PV = "1.3.0"

RPM_NAME = "libtommath-examples-1.3.0-1.9.noarch.rpm"
RPM_HASH = "d36bc2041a6c2dbec80dfe6add7b152defae7a1de947599d24626bb991a6496b0728a59e3e4634adaf83665121e1770ca1eca6af06245035a28f5c52d2cfe6c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtommath-examples \
libtommath0-examples"

RDEPENDS:${PN} += ""

inherit rpm
