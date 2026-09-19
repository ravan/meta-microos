SUMMARY = "Documentation for texlive-interpreter"
DESCRIPTION = "This package includes the documentation for texlive-interpreter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn27232"

RPM_NAME = "texlive-interpreter-doc-2026.226.1.2svn27232-60.2.noarch.rpm"
RPM_HASH = "eb8bf2d1fd2bab337c1fdd9d5b10aa3fe5276ec881320fbf7c08296b7cd4c780e53e90e2bd03102f92a2875995df30446afb203b16425433b845d63b0d37319b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interpreter-doc"

RDEPENDS:${PN} += ""

inherit rpm
