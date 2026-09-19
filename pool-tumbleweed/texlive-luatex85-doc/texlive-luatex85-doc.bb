SUMMARY = "Documentation for texlive-luatex85"
DESCRIPTION = "This package includes the documentation for texlive-luatex85"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-luatex85-doc-2026.226.1.4svn77682-59.2.noarch.rpm"
RPM_HASH = "f614862bcfc7d1f6ed0c958cc61e2359d43b785d53c7652ed34469ddf06d6945e7ca3c3e225e71dcc067eca4bc03717955e09c33fd601c7b56d804c97fb9b851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatex85-doc"

RDEPENDS:${PN} += ""

inherit rpm
