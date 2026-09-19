SUMMARY = "Documentation for texlive-advdate"
DESCRIPTION = "This package includes the documentation for texlive-advdate"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-advdate-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "e0e69a18b605a75211061fdc734c428174f41f41c8b1148ad1627afe672c88054f1702aa4edd22a07f288c0677997466fd8e9494d617f9b0937f777f5a0ffdc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-advdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
