SUMMARY = "Haskell wizards library documentation"
DESCRIPTION = "This package provides the Haskell wizards library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-doc-1.0.3-7.16.noarch.rpm"
RPM_HASH = "22feb8227d61b6259fcac90403eb081c3f91b7383f43ba9ed94d5956f65db64f32968658a6074261bf8c378e1c4f8e24cf63747b0ef85f4ecb765f508edda750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wizards-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
