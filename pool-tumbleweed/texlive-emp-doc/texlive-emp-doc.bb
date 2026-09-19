SUMMARY = "Documentation for texlive-emp"
DESCRIPTION = "This package includes the documentation for texlive-emp"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn23483"

RPM_NAME = "texlive-emp-doc-2026.226.svn23483-61.4.noarch.rpm"
RPM_HASH = "06866e4de980a7ac7d4f0eaad63760a6ae6eaf794d875e35dd53d6d6687bb1890707867026adda80ebc1b135f292ae031bb5cba7303f98dff75b434789843b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emp-doc"

RDEPENDS:${PN} += ""

inherit rpm
