SUMMARY = "Haskell tasty library development files"
DESCRIPTION = "This package provides the Haskell tasty library development files."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "ghc-tasty-devel-1.5.4-1.3.aarch64.rpm"
RPM_HASH = "7381d9d9eb051d955a56b0e539cf5d9f3dc883905d8fe8a337c04e91d81cfbc24ecd6fda509a687e69c7b3ab47f535229a0f54e49a53d2088fcc4b69fd1334b7"

RPROVIDES:${PN} += "ghc-devel-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-tasty-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-tasty"

inherit rpm
