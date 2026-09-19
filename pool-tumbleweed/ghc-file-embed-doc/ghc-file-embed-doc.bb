SUMMARY = "Haskell file-embed library documentation"
DESCRIPTION = "This package provides the Haskell file-embed library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.0.16.0"

RPM_NAME = "ghc-file-embed-doc-0.0.16.0-1.19.noarch.rpm"
RPM_HASH = "0630f09c0509ae737534319db7d866a910a008d97e0fdb49cf817c781d8262190b82912c23f091e1c7fe1a40293fed3c44bebba24367f7a774cbdb868e2298b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-file-embed-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
