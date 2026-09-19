SUMMARY = "Documentation for texlive-mathfixs"
DESCRIPTION = "This package includes the documentation for texlive-mathfixs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.3svn74752"

RPM_NAME = "texlive-mathfixs-doc-2026.226.1.1.3svn74752-59.2.noarch.rpm"
RPM_HASH = "a9afc32b47a2b18541d2b5e31baa21b0b14369d5a6b545d866516eabe5e59dc37c1b6a1ec61c99bbc20f2f2eb3aac60da605963dc2d42f93c60da568b8caa3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathfixs-doc"

RDEPENDS:${PN} += ""

inherit rpm
