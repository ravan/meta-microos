SUMMARY = "Haskell conduit-extra library documentation"
DESCRIPTION = "This package provides the Haskell conduit-extra library documentation."
LICENSE = "MIT"

PV = "1.3.8"

RPM_NAME = "ghc-conduit-extra-doc-1.3.8-1.16.noarch.rpm"
RPM_HASH = "9ce444212fd0211013148ac651240f6f0f565abaa675d3f193882f609b219e17ddafbd99d19f15636a4315c8136e2fb75dedab24cb6fcaae95072da2ebcaabe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-conduit-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
