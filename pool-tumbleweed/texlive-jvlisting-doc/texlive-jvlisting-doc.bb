SUMMARY = "Documentation for texlive-jvlisting"
DESCRIPTION = "This package includes the documentation for texlive-jvlisting"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn24638"

RPM_NAME = "texlive-jvlisting-doc-2026.226.0.0.7svn24638-63.2.noarch.rpm"
RPM_HASH = "de8d334c943d6cccc20a3df241fe8171a7db45c27ee9328bdc42862ed58153ff9051ba56f9341256bfc48992c7f83c4d233dc2a668d77f58214a304cf607df78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jvlisting-doc"

RDEPENDS:${PN} += ""

inherit rpm
