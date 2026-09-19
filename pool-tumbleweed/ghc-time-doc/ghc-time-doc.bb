SUMMARY = "Haskell time library documentation"
DESCRIPTION = "This package provides the Haskell time library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.14"

RPM_NAME = "ghc-time-doc-1.14-1.3.noarch.rpm"
RPM_HASH = "89a476a2f525f81becc8ddd09b94ba1c9c59c5128d9ef6cdb9db068db08d60078ee46cc899abc33bb19acb58377fb97f8dd4afbc0205c3f5d73639a6be36fc0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
