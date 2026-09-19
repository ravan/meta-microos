SUMMARY = "Documentation for texlive-shapes"
DESCRIPTION = "This package includes the documentation for texlive-shapes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn42428"

RPM_NAME = "texlive-shapes-doc-2026.226.1.1svn42428-60.2.noarch.rpm"
RPM_HASH = "d18b581b96ca2dbed4a49b3f7107cf388a34cb1e7326885a945c487024461fd852d26adbfdf6a82ec507f38ef2b6c65965ec08628e2329f4c274556a61dd968b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shapes-doc"

RDEPENDS:${PN} += ""

inherit rpm
