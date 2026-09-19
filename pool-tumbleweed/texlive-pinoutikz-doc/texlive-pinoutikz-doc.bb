SUMMARY = "Documentation for texlive-pinoutikz"
DESCRIPTION = "This package includes the documentation for texlive-pinoutikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn55966"

RPM_NAME = "texlive-pinoutikz-doc-2026.226.1.1.2svn55966-58.2.noarch.rpm"
RPM_HASH = "220ba9b9f9a665af44c6eb83acedc95c372f787e57523efb2b478c38bd0ea44a3913fa5a8864930e75df183bdc8289fd29a3ce7eaf377709f36dc86918c4e6b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pinoutikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
