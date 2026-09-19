SUMMARY = "Documentation for texlive-templatetools"
DESCRIPTION = "This package includes the documentation for texlive-templatetools"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2svn67201"

RPM_NAME = "texlive-templatetools-doc-2026.227.0.0.2svn67201-62.2.noarch.rpm"
RPM_HASH = "1c47188d413dfc8066cdfd37b49d9b4fd87430c2af603e16c8323f5367692f6c994f07a043ed2edaaf72ccea3b80f02af3eeb06191871868a9156d07bef6637b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-templatetools-doc"

RDEPENDS:${PN} += ""

inherit rpm
