SUMMARY = "Documentation for texlive-pst-infixplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-infixplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn15878"

RPM_NAME = "texlive-pst-infixplot-doc-2026.226.0.0.11svn15878-59.2.noarch.rpm"
RPM_HASH = "892e2cdb03b30a88d7918c959fe15f1adf01f08448cdf0d0eb9d9ee40189108c584c83ba7ee0397c009b0df27e465017361aa59fb2b41a8daa5a9bfd4b82028b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-infixplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
