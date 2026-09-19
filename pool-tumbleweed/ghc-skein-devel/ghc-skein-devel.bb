SUMMARY = "Haskell skein library development files"
DESCRIPTION = "This package provides the Haskell skein library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-devel-1.0.9.4-4.26.aarch64.rpm"
RPM_HASH = "4b811a6c99fc32795fae01b2aa467c4a5eb811695fe2efa2c2c3cba1a1b08724ad233413e3afb6bee5e999c5f98d438b1ac874f3e3d6ea56df951f7e23bcfdf7"

RPROVIDES:${PN} += "ghc-devel-skein-1.0.9.4-1EnnjgQJNmMDn7VwfDrKcW \
ghc-skein-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-crypto-api-0.13.3-BvysNl9crxvRkhKzviyjB \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-skein"

inherit rpm
