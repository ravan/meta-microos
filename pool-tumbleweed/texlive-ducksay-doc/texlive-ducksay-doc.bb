SUMMARY = "Documentation for texlive-ducksay"
DESCRIPTION = "This package includes the documentation for texlive-ducksay"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.8svn76911"

RPM_NAME = "texlive-ducksay-doc-2026.226.2.8svn76911-59.2.noarch.rpm"
RPM_HASH = "94254c6eadb8a855833c2db8556f459286c79bae3bc96d9d0c84a0d12e76941431e2c3de6d2af89b60090c1dc79badf4be4fcfc4b24e45e14fec34d842b5ae8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ducksay-doc"

RDEPENDS:${PN} += ""

inherit rpm
