SUMMARY = "Haskell ghc-bignum library documentation"
DESCRIPTION = "This package provides the Haskell ghc-bignum library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-ghc-bignum-doc-1.3-1.3.noarch.rpm"
RPM_HASH = "d7af4e0103bc3f18f042dbfcd6617b68e2984939e73480cf0c1f1ca22b7b0ba15e90176489efd34a11dfa6d7ee42b7e01596fe75331587ad76d75db7b0e072b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-bignum-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
