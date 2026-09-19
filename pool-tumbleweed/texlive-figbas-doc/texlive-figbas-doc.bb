SUMMARY = "Documentation for texlive-figbas"
DESCRIPTION = "This package includes the documentation for texlive-figbas"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn28943"

RPM_NAME = "texlive-figbas-doc-2026.226.1.0.3svn28943-59.2.noarch.rpm"
RPM_HASH = "cbf255c3daeb6dabb048bfe2868620d679d9cfb918bd9c6d1af604bbf09cd02f43ab82485bca6c8f5630ed17a0dfa469ef27ac15749b927d85298810543fe8c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figbas-doc"

RDEPENDS:${PN} += ""

inherit rpm
