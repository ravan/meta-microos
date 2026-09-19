SUMMARY = "Documentation for texlive-electrumadf"
DESCRIPTION = "This package includes the documentation for texlive-electrumadf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-electrumadf-doc-2026.226.1.1svn77682-61.4.noarch.rpm"
RPM_HASH = "0733db82c3ba1a0499d8297fafea9b3d06a5effd5a319220d1bfcb73124ab57a9481e0f9fcf31634bdf6e8691b9286e183b3fa11b2ff6b2db3024147e620c3cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-electrumadf-doc"

RDEPENDS:${PN} += ""

inherit rpm
