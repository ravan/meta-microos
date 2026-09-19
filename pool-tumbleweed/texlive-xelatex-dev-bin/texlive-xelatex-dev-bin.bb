SUMMARY = "Binary files of xelatex-dev"
DESCRIPTION = "Binary files of xelatex-dev"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn53999"

RPM_NAME = "texlive-xelatex-dev-bin-2026.20260301.svn53999-120.4.aarch64.rpm"
RPM_HASH = "32747f41ebba61df71d839bef817047b00bb2eab84b9665f37a7d90496e96ac6fd66fa4c6282db2142e739bc9e246a7876223fa08c017d06c514af1ac1a8dbe8"

RPROVIDES:${PN} += "texlive-xelatex-dev-bin"

RDEPENDS:${PN} += "texlive-xelatex-dev"

inherit rpm
