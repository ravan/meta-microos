SUMMARY = "A model for human colour/color perception"
DESCRIPTION = "This package provides a data type for colours and transparency. \
Colours can be blended and composed. Various colour spaces are supported. \
A module of colour names ('Data.Colour.Names') is provided."
LICENSE = "MIT"

PV = "2.3.7"

RPM_NAME = "ghc-colour-2.3.7-1.2.aarch64.rpm"
RPM_HASH = "f6d7eb5d072740ee36cdc76500f41d5d2691570798db09a1e82ab581cf0f8929a142ad01dfc4ca22afa2c481e2e322862444353aebc0c8ece848515a6eb167cd"

RPROVIDES:${PN} += "ghc-colour \
libHScolour-2.3.7-LuxtbazHK7IK55ldBice4c-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
