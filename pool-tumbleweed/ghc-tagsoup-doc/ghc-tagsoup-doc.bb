SUMMARY = "Haskell tagsoup library documentation"
DESCRIPTION = "This package provides the Haskell tagsoup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-doc-0.14.8-6.31.noarch.rpm"
RPM_HASH = "c5be9bb32c82798a0722a15e4f221045c913830cef37b0c1e02b0c99da43c6eff992ba987a754807c3b7e3537b6d35d8da2ff9fe2ae1cefeca90227924a42f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tagsoup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
