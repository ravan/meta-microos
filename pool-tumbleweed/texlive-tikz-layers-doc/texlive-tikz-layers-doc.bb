SUMMARY = "Documentation for texlive-tikz-layers"
DESCRIPTION = "This package includes the documentation for texlive-tikz-layers"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn46660"

RPM_NAME = "texlive-tikz-layers-doc-2026.226.0.0.9svn46660-59.2.noarch.rpm"
RPM_HASH = "88042fef12b2b7ada6a0031168ffc4b8a45fe5bd24dafe1c0500269d913880498dcab7c24209fcda3dd594251d3210bcdf4007bcaa43f612fa5d711dbab97c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-layers-doc"

RDEPENDS:${PN} += ""

inherit rpm
