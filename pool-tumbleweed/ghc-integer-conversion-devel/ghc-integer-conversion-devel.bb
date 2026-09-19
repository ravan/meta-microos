SUMMARY = "Haskell integer-conversion library development files"
DESCRIPTION = "This package provides the Haskell integer-conversion library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-integer-conversion-devel-0.1.1-3.2.aarch64.rpm"
RPM_HASH = "425f3205c2379ef61c2c420d747c9ef1a267f1dc94b7c294a6b01fd294c67e764266fd8780e44f3212832be1b3fcb08f5124871c52d407eb1bfd5c2fe0881c80"

RPROVIDES:${PN} += "ghc-devel-integer-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO \
ghc-integer-conversion-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-text-2.1.4-cf23 \
ghc-integer-conversion"

inherit rpm
