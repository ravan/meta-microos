SUMMARY = "Binary files of git-latexdiff"
DESCRIPTION = "Binary files of git-latexdiff"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn54732"

RPM_NAME = "texlive-git-latexdiff-bin-2026.20260301.svn54732-120.4.aarch64.rpm"
RPM_HASH = "ebcacb2f3ad4ab94443ea5f4afb508703acd8c73f22e8b026dc3d501acf5904d0564e3961994140c89e30231524e8c3b6a267f8cdc847dcedf9723445d5a7653"

RPROVIDES:${PN} += "texlive-git-latexdiff-bin"

RDEPENDS:${PN} += "texlive-git-latexdiff"

inherit rpm
