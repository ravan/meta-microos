SUMMARY = "Documentation for texlive-pst-marble"
DESCRIPTION = "This package includes the documentation for texlive-pst-marble"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn50925"

RPM_NAME = "texlive-pst-marble-doc-2026.226.1.6svn50925-59.2.noarch.rpm"
RPM_HASH = "c09ee9601438856f37058c1229c5928655362cb2fd516da2dd8e60380e7f052764bb6a938980c07b5d6799e4b88b34c7364a7bea32995ce9e740fe5e3108d00c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-marble-doc"

RDEPENDS:${PN} += ""

inherit rpm
