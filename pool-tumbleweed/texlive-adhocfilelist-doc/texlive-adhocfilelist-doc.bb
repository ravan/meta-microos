SUMMARY = "Documentation for texlive-adhocfilelist"
DESCRIPTION = "This package includes the documentation for texlive-adhocfilelist"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn29349"

RPM_NAME = "texlive-adhocfilelist-doc-2026.226.svn29349-61.2.noarch.rpm"
RPM_HASH = "a3e21ec98ed2c463fdf3a9447d564e0548abc3b9f5d774b4f866cbe7f6d05a440156dcff48fecaf5a3546c943759e3181fd2cd8e298d521fa59ac3dff564cabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adhocfilelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
