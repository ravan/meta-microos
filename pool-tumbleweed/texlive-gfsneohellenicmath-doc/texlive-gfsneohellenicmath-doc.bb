SUMMARY = "Documentation for texlive-gfsneohellenicmath"
DESCRIPTION = "This package includes the documentation for texlive-gfsneohellenicmath"
LICENSE = "OFL-1.1"

PV = "2026.226.1.02svn77682"

RPM_NAME = "texlive-gfsneohellenicmath-doc-2026.226.1.02svn77682-60.2.noarch.rpm"
RPM_HASH = "8ab6e61624789fa6b0cdbca93b2ad74e199c19f0d85bc9fd692c7c3a6f4367526826486793d708cb46e9db4be70ef58040907784b253bb4754463349ec7b196c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsneohellenicmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
