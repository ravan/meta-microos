SUMMARY = "Documentation for texlive-linop"
DESCRIPTION = "This package includes the documentation for texlive-linop"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn41304"

RPM_NAME = "texlive-linop-doc-2026.226.0.0.1svn41304-61.2.noarch.rpm"
RPM_HASH = "ecdd86b597c0b3be6e9cd104eee9e47b48486891d6309a2968d6bffd0bdf4957ae0c03df0a332fb24cff81e801612909d3742eec9bf38fb86528fe80d10a54cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linop-doc"

RDEPENDS:${PN} += ""

inherit rpm
