SUMMARY = "Documentation for texlive-ptptex"
DESCRIPTION = "This package includes the documentation for texlive-ptptex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-doc-2026.226.0.0.91svn19440-60.4.noarch.rpm"
RPM_HASH = "a2076a31714b3e909d205d003cfc57cf05c2e29eb8559c4f1be9248f8723ef30e9dcea9b8b131b9cab94f74ff747666151e9993566f1cde601854b4255aa75da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
