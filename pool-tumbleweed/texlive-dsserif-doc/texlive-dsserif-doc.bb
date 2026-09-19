SUMMARY = "Documentation for texlive-dsserif"
DESCRIPTION = "This package includes the documentation for texlive-dsserif"
LICENSE = "OFL-1.1"

PV = "2026.226.1.031svn77682"

RPM_NAME = "texlive-dsserif-doc-2026.226.1.031svn77682-59.2.noarch.rpm"
RPM_HASH = "6d8b61f7113ebb9e5cd98c0b26f9337ee5d6d1b6121ed20193193521903d55c0e96e1b8abc1a465a7a5fd9eae41480b62d1f7fe2664b5d2fdc6e9edda92288df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dsserif-doc"

RDEPENDS:${PN} += ""

inherit rpm
