SUMMARY = "Documentation for texlive-gradstudentresume"
DESCRIPTION = "This package includes the documentation for texlive-gradstudentresume"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn38832"

RPM_NAME = "texlive-gradstudentresume-doc-2026.226.svn38832-60.4.noarch.rpm"
RPM_HASH = "cd9250d1c546d625416448437b0bfa510ea5e75229fcc65ba3504399577143f0d8a3df798056a1027b07ec28981ea223a8e760512dd230aba1285942b40bfcf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradstudentresume-doc"

RDEPENDS:${PN} += ""

inherit rpm
