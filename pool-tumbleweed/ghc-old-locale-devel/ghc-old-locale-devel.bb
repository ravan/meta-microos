SUMMARY = "Haskell old-locale library development files"
DESCRIPTION = "This package provides the Haskell old-locale library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-devel-1.0.0.7-13.23.aarch64.rpm"
RPM_HASH = "106a39639f018b90b45ab0a29a1b25bfe6c2da15233f511e155b896b7eeda66764a7a7e3b090c71a348ad6bb61fe56796d90c9bb4c6fbd1bf0ac5eca302256b6"

RPROVIDES:${PN} += "ghc-devel-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-old-locale-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-old-locale"

inherit rpm
