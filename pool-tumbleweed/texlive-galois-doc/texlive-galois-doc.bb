SUMMARY = "Documentation for texlive-galois"
DESCRIPTION = "This package includes the documentation for texlive-galois"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-galois-doc-2026.226.1.5svn15878-60.2.noarch.rpm"
RPM_HASH = "e3cb3970815df62fc048e0383cdade8696e060a078614ecb4d6f997c50e80c5c9e825714b49b617d1b4152294a9b8700a646d84b4fe6782d533f6c351c045bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-galois-doc"

RDEPENDS:${PN} += ""

inherit rpm
