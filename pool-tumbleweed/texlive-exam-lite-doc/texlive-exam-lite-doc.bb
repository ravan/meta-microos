SUMMARY = "Documentation for texlive-exam-lite"
DESCRIPTION = "This package includes the documentation for texlive-exam-lite"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65754"

RPM_NAME = "texlive-exam-lite-doc-2026.226.svn65754-59.2.noarch.rpm"
RPM_HASH = "4eee54e312cdd36d51a617f165415a7d4c5a6ed9bece2029b1ba9e75298e5a45dc5c3d46c63b12969edf331b8d83cf73e1e1828958ad0dc683433a0ef6ed4718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-lite-doc"

RDEPENDS:${PN} += ""

inherit rpm
