SUMMARY = "Haskell data-default-class profiling library"
DESCRIPTION = "This package provides the Haskell data-default-class profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.0"

RPM_NAME = "ghc-data-default-class-prof-0.2.0.0-1.11.aarch64.rpm"
RPM_HASH = "83d383da513a19f6fc592a234fbc021e3e23bf2d8e8caf601bad12785021c0605acbdecadfcafb4e6aa05b145b0170d38c0978dce05eec20218a6e386bb10784"

RPROVIDES:${PN} += "ghc-data-default-class-prof \
ghc-prof-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62"

RDEPENDS:${PN} += "ghc-data-default-class-devel \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ"

inherit rpm
