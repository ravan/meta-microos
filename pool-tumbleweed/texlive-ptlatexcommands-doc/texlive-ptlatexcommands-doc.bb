SUMMARY = "Documentation for texlive-ptlatexcommands"
DESCRIPTION = "This package includes the documentation for texlive-ptlatexcommands"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn67125"

RPM_NAME = "texlive-ptlatexcommands-doc-2026.226.0.0.1svn67125-60.4.noarch.rpm"
RPM_HASH = "98d2780aa065fcda40f10fda434189b32b8768e6be4be696b8a228f5e4d75578bb6901bb5886258d8610f66bcf5fda3e2578be00018f5f424658fad954f4653d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptlatexcommands-doc"

RDEPENDS:${PN} += ""

inherit rpm
