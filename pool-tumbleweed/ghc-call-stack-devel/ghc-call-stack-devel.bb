SUMMARY = "Haskell call-stack library development files"
DESCRIPTION = "This package provides the Haskell call-stack library development files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-devel-0.4.0-2.35.aarch64.rpm"
RPM_HASH = "7f88f392c652b33a34a0780c21782f89d3207dfd93c740d41bed55f42ad1299bfb6dfc1952b410f1c059dd59bb4eddc78b347ec98ec04080eb2315ba8d8b1227"

RPROVIDES:${PN} += "ghc-call-stack-devel \
ghc-devel-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-call-stack \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
