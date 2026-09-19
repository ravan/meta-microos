SUMMARY = "Documentation for texlive-bidicontour"
DESCRIPTION = "This package includes the documentation for texlive-bidicontour"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-bidicontour-doc-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "ae20e4e7f3b0768f573e4f2e1425e789efee3cb170d81c645897d67470a035a95a887fb7d6b46eb3b16a52c8273c8c6a078ba277c460053b5f8cb8900953b2e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidicontour-doc"

RDEPENDS:${PN} += ""

inherit rpm
