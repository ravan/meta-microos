SUMMARY = "Haskell zlib library documentation"
DESCRIPTION = "This package provides the Haskell zlib library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-zlib-doc-0.7.1.1-1.9.noarch.rpm"
RPM_HASH = "ccf8f85b9bd4eb44f18c1217a49e7c595dcd3e43fdbf11f781745423844e359843d29e14f89c553bb55b3a9bc93973c8cc6c9295b6ac768fe892e79e9db4daac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-zlib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
