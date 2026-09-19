SUMMARY = "Documentation for texlive-rulercompass"
DESCRIPTION = "This package includes the documentation for texlive-rulercompass"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn32392"

RPM_NAME = "texlive-rulercompass-doc-2026.226.1svn32392-60.2.noarch.rpm"
RPM_HASH = "4f00769ed10b883d8fd583e6f07a6ba6aecb9505b9db4b3f2671182a37583dd8a75c7471333d9e6021d4eb347b3df54c1943a25bfc9d82d5b746d57612a9a59d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rulercompass-doc"

RDEPENDS:${PN} += ""

inherit rpm
