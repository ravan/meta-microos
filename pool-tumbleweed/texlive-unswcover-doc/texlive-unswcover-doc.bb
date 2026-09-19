SUMMARY = "Documentation for texlive-unswcover"
DESCRIPTION = "This package includes the documentation for texlive-unswcover"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn66115"

RPM_NAME = "texlive-unswcover-doc-2026.226.1.0svn66115-60.2.noarch.rpm"
RPM_HASH = "00eba4bd48025775568da061fb9bff4628031695294fb0d2fe8beb027c626b4caa455619767bcbe31b3286d163354a07370f379c24d73ea7e9d5318949e00f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unswcover-doc"

RDEPENDS:${PN} += ""

inherit rpm
