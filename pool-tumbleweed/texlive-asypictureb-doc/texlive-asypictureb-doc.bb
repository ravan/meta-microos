SUMMARY = "Documentation for texlive-asypictureb"
DESCRIPTION = "This package includes the documentation for texlive-asypictureb"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn73611"

RPM_NAME = "texlive-asypictureb-doc-2026.226.0.0.4svn73611-60.2.noarch.rpm"
RPM_HASH = "4aab9b5b20a252fda5b5b9945d272111fd4c77033091596c12bc743cc2eb890c029e2e3fafb28e30fbbc5f3b10bcce006c39a2690b9d3eae05256a6c6b1ab1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asypictureb-doc"

RDEPENDS:${PN} += ""

inherit rpm
