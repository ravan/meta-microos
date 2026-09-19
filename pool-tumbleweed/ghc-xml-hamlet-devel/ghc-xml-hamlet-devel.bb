SUMMARY = "Haskell xml-hamlet library development files"
DESCRIPTION = "This package provides the Haskell xml-hamlet library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.3"

RPM_NAME = "ghc-xml-hamlet-devel-0.5.0.3-1.10.aarch64.rpm"
RPM_HASH = "6c9ae6547039a47d593f3d820434f718db1be8d731a6bded0ec2c30647dded2f5a928ea3af90263171dd2b89a89eca524d3b676671709e62a7517362e50a5fce"

RPROVIDES:${PN} += "ghc-devel-xml-hamlet-0.5.0.3-G8bMr9HQdFfCaa7mBpjnmK \
ghc-xml-hamlet-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-xml-hamlet"

inherit rpm
