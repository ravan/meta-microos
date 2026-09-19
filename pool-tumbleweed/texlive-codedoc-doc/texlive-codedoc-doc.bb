SUMMARY = "Documentation for texlive-codedoc"
DESCRIPTION = "This package includes the documentation for texlive-codedoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn17630"

RPM_NAME = "texlive-codedoc-doc-2026.226.0.0.3svn17630-60.2.noarch.rpm"
RPM_HASH = "ad81684e0d34116651130797f1c9d23feb545d8da722e060145e192ab649be27928a57a7db1a9374dc148b1f9bfdad978bb4c94fe6d99ed9294748a6072b0610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codedoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
