SUMMARY = "Documentation for texlive-runtexfile"
DESCRIPTION = "This package includes the documentation for texlive-runtexfile"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.06svn76526"

RPM_NAME = "texlive-runtexfile-doc-2026.226.0.0.06svn76526-60.2.noarch.rpm"
RPM_HASH = "b0121bb692f7596a733157164c6cdc7c70ff99826a20c592722588465448b15e641c63fa526dd9d245acd756fbc08f80c071d65053d8f1586de8d6160f8788ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-runtexfile.1 \
texlive-runtexfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
