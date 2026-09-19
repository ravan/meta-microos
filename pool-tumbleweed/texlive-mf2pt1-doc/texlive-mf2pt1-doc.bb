SUMMARY = "Documentation for texlive-mf2pt1"
DESCRIPTION = "This package includes the documentation for texlive-mf2pt1"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.8svn71883"

RPM_NAME = "texlive-mf2pt1-doc-2026.226.2.8svn71883-61.2.noarch.rpm"
RPM_HASH = "f2d3a3b69373377f0f4489c77e4897476fad91dae348de07e31d4f569ca501eef01e902e1d3d94e589b35ef2d8ae0a56462f6cb35742f5aa25d562a783294449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mf2pt1-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
