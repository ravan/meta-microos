SUMMARY = "Documentation for texlive-minitoc"
DESCRIPTION = "This package includes the documentation for texlive-minitoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.62svn77682"

RPM_NAME = "texlive-minitoc-doc-2026.226.62svn77682-61.2.noarch.rpm"
RPM_HASH = "92aadea6eb622df6ba2ed2cdec716d1698436fe67d85e0b9aac42dbb32899094ac0f0b5bbfe96e8c4c20542d72ab5a7892f405788ba19239f20335b2069940ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-minitoc-doc-en \
texlive-minitoc-doc"

RDEPENDS:${PN} += "/usr/bin/csh \
/usr/bin/sh"

inherit rpm
