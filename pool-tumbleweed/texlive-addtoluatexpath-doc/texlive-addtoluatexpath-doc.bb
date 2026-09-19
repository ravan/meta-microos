SUMMARY = "Documentation for texlive-addtoluatexpath"
DESCRIPTION = "This package includes the documentation for texlive-addtoluatexpath"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73424"

RPM_NAME = "texlive-addtoluatexpath-doc-2026.226.svn73424-61.2.noarch.rpm"
RPM_HASH = "1b5793c63f6d8874f20b9d99218d195923f72f8a90ff7dc2e9f850d781d1fbd7f507eb7d4634070eb8d6e7cfe1ef6e0dca0605b3bb134d97173bd9109d27cbb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addtoluatexpath-doc"

RDEPENDS:${PN} += ""

inherit rpm
