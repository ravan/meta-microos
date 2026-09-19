SUMMARY = "Documentation for texlive-schedule"
DESCRIPTION = "This package includes the documentation for texlive-schedule"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn51805"

RPM_NAME = "texlive-schedule-doc-2026.226.1.20svn51805-60.2.noarch.rpm"
RPM_HASH = "70592d7abae596687de4145101e97325cf4934acaaa53627d2bdc0618cb7784f6951c6c9d19f8750e1dfaabd315d13d808085a79037a9c0337fd1ef5d9ab9482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schedule-doc"

RDEPENDS:${PN} += ""

inherit rpm
