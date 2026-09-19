SUMMARY = "Haskell regex-posix library development files"
DESCRIPTION = "This package provides the Haskell regex-posix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.2"

RPM_NAME = "ghc-regex-posix-devel-0.96.0.2-1.12.aarch64.rpm"
RPM_HASH = "68ae2d950f2b3fb59a5db6f72050d2118e74771e42600fa761b2fa62dd1d57f71d79c7515075e8e783c19f281034006f13d3f9aa1942e1cce8c0c06ff1392a66"

RPROVIDES:${PN} += "ghc-devel-regex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS \
ghc-regex-posix-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-regex-posix"

inherit rpm
