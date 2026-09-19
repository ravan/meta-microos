SUMMARY = "MetaPost module with different types of arrow heads"
DESCRIPTION = "A package to provide different types of arrow heads to be used \
with MetaPost commands drawarrow and drawdblarrow commands."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.1svn39729"

RPM_NAME = "texlive-mparrows-2026.226.0.0.1svn39729-61.2.noarch.rpm"
RPM_HASH = "db90afb9c913196d12bce5c01bf981855cc6c5266c290d940566491e2347d6aca7aa5573463b24329600ea8531604f9388c3d0346c0134405097e1d7766333f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mparrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
