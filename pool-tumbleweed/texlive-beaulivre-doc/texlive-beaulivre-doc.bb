SUMMARY = "Documentation for texlive-beaulivre"
DESCRIPTION = "This package includes the documentation for texlive-beaulivre"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-beaulivre-doc-2026.226.svn78004-61.2.noarch.rpm"
RPM_HASH = "65dcb132ff1c0512f509636e8e409b4908fbe9747f9a1ddfb445b54e9ae4dd3301108e9cc8c36278f8c36f97326b378347069a973039c19dc28b655056dbcfcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beaulivre-doc"

RDEPENDS:${PN} += ""

inherit rpm
