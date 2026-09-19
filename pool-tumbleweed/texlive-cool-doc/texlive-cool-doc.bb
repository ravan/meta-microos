SUMMARY = "Documentation for texlive-cool"
DESCRIPTION = "This package includes the documentation for texlive-cool"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.35svn76924"

RPM_NAME = "texlive-cool-doc-2026.226.1.35svn76924-61.2.noarch.rpm"
RPM_HASH = "7c6be234775acdbbc350ad244bb5319e5843177c556bbe8d968fa6090b1319e22ec0ac021d23a02b99120ab0e9a015e9091d49d87e3e603bf95c5d539b6df284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cool-doc"

RDEPENDS:${PN} += ""

inherit rpm
