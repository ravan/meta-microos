SUMMARY = "Haskell data-default-class library development files"
DESCRIPTION = "This package provides the Haskell data-default-class library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.0"

RPM_NAME = "ghc-data-default-class-devel-0.2.0.0-1.11.aarch64.rpm"
RPM_HASH = "7e4441ba1ee3a69f4204c033aa2e28ec56f4c66b4eb314ac23a2328add8b9da747dcb4e51fe6baa51636e869c220c2ce4b7c082a65217afea0b64e033093fcbb"

RPROVIDES:${PN} += "ghc-data-default-class-devel \
ghc-devel-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-default-class \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ"

inherit rpm
