SUMMARY = "Documentation for texlive-hamnosys"
DESCRIPTION = "This package includes the documentation for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-doc-2026.226.1.0.3svn61941-60.4.noarch.rpm"
RPM_HASH = "dc6a661142310bf97d05e2d0858496eeb8a1298530e882a3dcf90c4c3a675165828842623330a241cef77823bde27acb0b765941927bf9042f1d7c9888515c47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hamnosys-doc"

RDEPENDS:${PN} += ""

inherit rpm
