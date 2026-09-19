SUMMARY = "Documentation for texlive-screenplay-pkg"
DESCRIPTION = "This package includes the documentation for texlive-screenplay-pkg"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn44965"

RPM_NAME = "texlive-screenplay-pkg-doc-2026.226.1.1svn44965-60.2.noarch.rpm"
RPM_HASH = "5a9c884aa689fd64f8cc3bb13b3ef3138d3614639eaf1b5340671f8ca3ff374e0d49af36128938e1893de12ee05f3265a84fd0e32bfacbe95fe9db39258d03af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-screenplay-pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
