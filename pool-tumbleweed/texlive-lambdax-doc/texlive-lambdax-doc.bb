SUMMARY = "Documentation for texlive-lambdax"
DESCRIPTION = "This package includes the documentation for texlive-lambdax"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn60278"

RPM_NAME = "texlive-lambdax-doc-2026.226.1.1svn60278-63.2.noarch.rpm"
RPM_HASH = "eb339328e70728287f14d9627838063a422862423ff51f0ac661531408594b9945e3a5fe996d984076e4c88de1c0bd91dbd1c1ab308b512293e1fbffacb86e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lambdax-doc"

RDEPENDS:${PN} += ""

inherit rpm
