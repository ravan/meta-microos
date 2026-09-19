SUMMARY = "Haskell colour library development files"
DESCRIPTION = "This package provides the Haskell colour library development files."
LICENSE = "MIT"

PV = "2.3.7"

RPM_NAME = "ghc-colour-devel-2.3.7-1.2.aarch64.rpm"
RPM_HASH = "0aa87b8f3bb47d6b2517a89d372f408fd68f1afec48526c79fb6026fcb9c6bab4a5357c78d4899a6db779d5434c11d338662cb433bba960ee5a70eb050ca021b"

RPROVIDES:${PN} += "ghc-colour-devel \
ghc-devel-colour-2.3.7-LuxtbazHK7IK55ldBice4c"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-colour \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
