SUMMARY = "Documentation for texlive-aramaic-serto"
DESCRIPTION = "This package includes the documentation for texlive-aramaic-serto"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn74548"

RPM_NAME = "texlive-aramaic-serto-doc-2026.226.1.3.2svn74548-61.2.noarch.rpm"
RPM_HASH = "bd6b500eaa86f8596b54c8f670a8f02d303d9f33f34c4142c67696dad457c0d85e0d4862014a5569a9d38cac4efcea7774258c08722a855f0e752350a15f43f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aramaic-serto-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
