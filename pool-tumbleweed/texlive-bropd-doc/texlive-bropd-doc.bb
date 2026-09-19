SUMMARY = "Documentation for texlive-bropd"
DESCRIPTION = "This package includes the documentation for texlive-bropd"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn35383"

RPM_NAME = "texlive-bropd-doc-2026.226.1.2svn35383-59.2.noarch.rpm"
RPM_HASH = "b5721e081c0230b20fad1e21baa509b52e7c6b75bf8d23318775c49db459772269dfc1550a857479c43a59ad6ca2967ced78233a2a156de27b3042fb3af4b173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bropd-doc"

RDEPENDS:${PN} += ""

inherit rpm
