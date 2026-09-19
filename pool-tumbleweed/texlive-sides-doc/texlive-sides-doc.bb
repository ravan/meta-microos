SUMMARY = "Documentation for texlive-sides"
DESCRIPTION = "This package includes the documentation for texlive-sides"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-sides-doc-2026.226.svn76924-60.2.noarch.rpm"
RPM_HASH = "5e4703fcd1965e88ac8ff06d393833dfebe135e706772cc07b27f4ca9624c9f3e43377c7d58cc7d12df815d7d0d00e450809e69b28be3f6490872ceea59c53b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sides-doc"

RDEPENDS:${PN} += ""

inherit rpm
