SUMMARY = "Haskell math-functions library development files"
DESCRIPTION = "This package provides the Haskell math-functions library development files."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.4"

RPM_NAME = "ghc-math-functions-devel-0.3.4.4-1.35.aarch64.rpm"
RPM_HASH = "21263a3edd6aee695213f8199beeee8a1a8e53266567eecba2e97a6338510557c372272211df7041d661f1c0a13d697dd87e245d31156a1e56467afc539aab70"

RPROVIDES:${PN} += "ghc-devel-math-functions-0.3.4.4-q26fT9mxS1GCWlSGs7P32 \
ghc-math-functions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-math-functions"

inherit rpm
