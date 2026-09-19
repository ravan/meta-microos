SUMMARY = "Documentation for texlive-yinit-otf"
DESCRIPTION = "This package includes the documentation for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-doc-2026.226.1.0svn40207-59.4.noarch.rpm"
RPM_HASH = "b72ba18ca1b3033b843856cc535eb32027db52a3cef04c9b7174d04e6e78e64a7168b6e12b89283d81af4aba46b70b1b4d43f27200a97c129718bef7be6c09c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yinit-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
