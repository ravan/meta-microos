SUMMARY = "Documentation for texlive-eskdx"
DESCRIPTION = "This package includes the documentation for texlive-eskdx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.98svn29235"

RPM_NAME = "texlive-eskdx-doc-2026.226.0.0.98svn29235-59.2.noarch.rpm"
RPM_HASH = "043ddffae4d468ff39d40274b9d7c010ff3c7f4b1c5b747c33859aca63944a1442d913e9d47217d2c38727aa9ffd3feeec4a841b42a76b8e03d0da0def0b3c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eskdx-doc-ru \
texlive-eskdx-doc"

RDEPENDS:${PN} += ""

inherit rpm
