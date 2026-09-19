SUMMARY = "Documentation for texlive-lectures"
DESCRIPTION = "This package includes the documentation for texlive-lectures"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.7svn74632"

RPM_NAME = "texlive-lectures-doc-2026.226.1.0.7svn74632-61.2.noarch.rpm"
RPM_HASH = "eace97851037a1f6b34ed89227791a2b4c68e0b51f69097c269225b7ff4ad36f73562ab36f6a54988968277ce6408299aadef358e66ec40a7f15851c02d657a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lectures-doc"

RDEPENDS:${PN} += ""

inherit rpm
