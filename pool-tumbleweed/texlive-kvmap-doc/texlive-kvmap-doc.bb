SUMMARY = "Documentation for texlive-kvmap"
DESCRIPTION = "This package includes the documentation for texlive-kvmap"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.5svn67201"

RPM_NAME = "texlive-kvmap-doc-2026.226.0.0.3.5svn67201-63.2.noarch.rpm"
RPM_HASH = "07f0b5f90c2dfded2f11a977c0e2124614c4c27e907c3c2d5827057e1c961d3a68b399e39bfeab11a24b8a628e137a57366c1e7d61d15fad78f5b6bf2bf6e51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kvmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
