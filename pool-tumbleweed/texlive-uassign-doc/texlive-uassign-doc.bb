SUMMARY = "Documentation for texlive-uassign"
DESCRIPTION = "This package includes the documentation for texlive-uassign"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn38459"

RPM_NAME = "texlive-uassign-doc-2026.226.1.01svn38459-59.2.noarch.rpm"
RPM_HASH = "b9151059d58527da024c6c65eb317c19a0ae4e7feef0ac9add4bbb062296287e717463db4faa0aa447001d571a568a01a3689fb1162db55449b9c5f1c5b7d0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uassign-doc"

RDEPENDS:${PN} += ""

inherit rpm
