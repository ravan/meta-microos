SUMMARY = "Documentation for texlive-pfarrei"
DESCRIPTION = "This package includes the documentation for texlive-pfarrei"
LICENSE = "LPPL-1.0"

PV = "2026.226.r37svn68950"

RPM_NAME = "texlive-pfarrei-doc-2026.226.r37svn68950-58.2.noarch.rpm"
RPM_HASH = "5b509d975ad7d7f85e6854260681e82e2e24aa94f2c57cf76c1fb2952fcd4fcc7ab97fec38ffc928cce27aa3ddb17c57b598c515f4f9f053a32d3545645d0482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pfarrei-doc-de \
texlive-pfarrei-doc"

RDEPENDS:${PN} += ""

inherit rpm
