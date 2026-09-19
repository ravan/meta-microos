SUMMARY = "Documentation for texlive-arabtex"
DESCRIPTION = "This package includes the documentation for texlive-arabtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.17svn78101"

RPM_NAME = "texlive-arabtex-doc-2026.226.3.17svn78101-61.2.noarch.rpm"
RPM_HASH = "fd7df92c255f9e350efa4385979b9b712fab36bc68335c066e368742e88c104cd46b278f3862781dda328db601d5d8d875b68f83ea0071bf347141e4e0f52ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
