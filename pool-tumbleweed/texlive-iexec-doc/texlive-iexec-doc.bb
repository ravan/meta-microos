SUMMARY = "Documentation for texlive-iexec"
DESCRIPTION = "This package includes the documentation for texlive-iexec"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.15.0svn73480"

RPM_NAME = "texlive-iexec-doc-2026.226.0.0.15.0svn73480-60.2.noarch.rpm"
RPM_HASH = "a86068eee73d130318dce103006da965100d262f51011df4762a733983580d28312723271e2a058ec9dd4d5d8a854fc2b5251f43441f696aba023ec2b1a8952f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iexec-doc"

RDEPENDS:${PN} += ""

inherit rpm
