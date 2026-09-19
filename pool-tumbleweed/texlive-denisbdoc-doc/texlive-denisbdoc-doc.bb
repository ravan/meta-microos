SUMMARY = "Documentation for texlive-denisbdoc"
DESCRIPTION = "This package includes the documentation for texlive-denisbdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.6svn77982"

RPM_NAME = "texlive-denisbdoc-doc-2026.226.0.0.9.6svn77982-59.2.noarch.rpm"
RPM_HASH = "f154f0599d8d664bbc194532d5065fe68bfde3dea6a642e1978bc9b2962e8dcaa7a15fa396ea29ea432d7932e899fba0655d7479fd34a46e9089f7348dc0e5f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-denisbdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
