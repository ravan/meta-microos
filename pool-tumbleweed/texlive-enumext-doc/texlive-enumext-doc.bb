SUMMARY = "Documentation for texlive-enumext"
DESCRIPTION = "This package includes the documentation for texlive-enumext"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77364"

RPM_NAME = "texlive-enumext-doc-2026.226.2.1svn77364-61.4.noarch.rpm"
RPM_HASH = "afc87e95ba13ded848e39dee4cef704891f869ef569201956dea53aa2636b3ca332dc0f49100fcbffebf9f3a3ab3f892a51960593687cadc5925a8ded35be624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumext-doc"

RDEPENDS:${PN} += ""

inherit rpm
