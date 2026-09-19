SUMMARY = "Haskell syb profiling library"
DESCRIPTION = "This package provides the Haskell syb profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "ghc-syb-prof-0.7.4-1.3.aarch64.rpm"
RPM_HASH = "da1da49a5edce66ca69bc957d1bff3aa54b0ac069e2453dd364039f8877d70b5c46f7f065bb52631642fecb5d7a9e824181005fbf39a99f70645e8b74e0787bc"

RPROVIDES:${PN} += "ghc-prof-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-syb-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-syb-devel"

inherit rpm
