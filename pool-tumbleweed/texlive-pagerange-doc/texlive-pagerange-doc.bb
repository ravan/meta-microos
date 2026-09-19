SUMMARY = "Documentation for texlive-pagerange"
DESCRIPTION = "This package includes the documentation for texlive-pagerange"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn16915"

RPM_NAME = "texlive-pagerange-doc-2026.226.0.0.5svn16915-58.2.noarch.rpm"
RPM_HASH = "d4995daddcaaeb0c1cf37db076e3a2b369e7f647e0d84d3446eb6a8578db5a74255c550551157de43a5b12b1c8767543ae57d79157067cb4f69501d5b177016c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagerange-doc"

RDEPENDS:${PN} += ""

inherit rpm
