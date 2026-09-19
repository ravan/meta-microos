SUMMARY = "Documentation for texlive-citation-style-language"
DESCRIPTION = "This package includes the documentation for texlive-citation-style-language"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn77682"

RPM_NAME = "texlive-citation-style-language-doc-2026.226.0.0.9.1svn77682-60.2.noarch.rpm"
RPM_HASH = "67a6f4a589ad0842745934af3af3225f3cc3170fedc93b7cefa7adc0e1f77ed8693643263a1cbebfd5947b952f8141c7302a251985e9ffc600f9a8f04ed3df2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-citeproc-lua.1 \
texlive-citation-style-language-doc"

RDEPENDS:${PN} += ""

inherit rpm
