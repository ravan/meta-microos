SUMMARY = "Documentation for texlive-ydoc"
DESCRIPTION = "This package includes the documentation for texlive-ydoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7alphasvn64887"

RPM_NAME = "texlive-ydoc-doc-2026.226.0.0.7alphasvn64887-59.4.noarch.rpm"
RPM_HASH = "aee458ce8169762892aeb4558fdc3f0066f639be946441eea399093cf2501df14baa4383791bcf20b78a56267e57917f2478422d0800e5fe7e4fc2685b1c16a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ydoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
