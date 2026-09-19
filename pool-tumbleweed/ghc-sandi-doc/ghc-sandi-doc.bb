SUMMARY = "Haskell sandi library documentation"
DESCRIPTION = "This package provides the Haskell sandi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-doc-0.5-5.60.noarch.rpm"
RPM_HASH = "1810f29fe293ce205053c037384ae13517fd2a6c54d5ff32bfe0e3e0dd63bfe80853fb2ab425b2259cb81d8800c26092600f6aef52cc572b4b1242764d1d2197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-sandi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
