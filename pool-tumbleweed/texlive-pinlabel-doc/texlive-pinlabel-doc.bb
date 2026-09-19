SUMMARY = "Documentation for texlive-pinlabel"
DESCRIPTION = "This package includes the documentation for texlive-pinlabel"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn24769"

RPM_NAME = "texlive-pinlabel-doc-2026.226.1.2svn24769-58.2.noarch.rpm"
RPM_HASH = "1bab778fa747d1319bd7abe3df0f42e981d4d62e34c99af62ca17a403701b67e1b0a8f8cd6731c7e7bec170a09ffd9b824971e867937d0552cadceec96c0fa60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pinlabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
