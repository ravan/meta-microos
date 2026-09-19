SUMMARY = "Haskell regex-tdfa library development files"
DESCRIPTION = "This package provides the Haskell regex-tdfa library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.5"

RPM_NAME = "ghc-regex-tdfa-devel-1.3.2.5-1.9.aarch64.rpm"
RPM_HASH = "578283ef40e1dfb09b556545f47075b70208cef3e1b2b20ee1662e4f411a1d60759788c2692f6853a5530bca59df04980f7a1d1c46d4ea9bfd647ee9b5dbef49"

RPROVIDES:${PN} += "ghc-devel-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-regex-tdfa-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-devel-text-2.1.4-cf23 \
ghc-regex-tdfa"

inherit rpm
