SUMMARY = "Documentation for texlive-mfirstuc"
DESCRIPTION = "This package includes the documentation for texlive-mfirstuc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.09svn77682"

RPM_NAME = "texlive-mfirstuc-doc-2026.226.2.09svn77682-61.2.noarch.rpm"
RPM_HASH = "dd0c14e48043a61ba27c7c52dc8b56bbf3cfc8d4895c58ed791fa58c6071413b4e9238eae2dfdd88e0b3280d2a47b336d7ad220b2d03753b12961e9b865514fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfirstuc-doc"

RDEPENDS:${PN} += ""

inherit rpm
