SUMMARY = "Multifile documents"
DESCRIPTION = "This is an experimental package aiming to provide a different \
approach for multidocument works (mainly, books with a document \
per chapter). Unlike the \\include mechanism, every subdocument \
is a complete normal LaTeX document and may be typeset \
separately. What the package does is sharing the .aux files. \
The present release is an alpha version, and no attempt has yet \
been made to allow it to work with, say, hyperref."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn51480"

RPM_NAME = "texlive-subdocs-2026.226.0.0.1svn51480-64.2.noarch.rpm"
RPM_HASH = "c7b2a99db601b7db0821cd27aa398f9a463f7686c8af020d040f3227f3eba8f8b8fbcfdf41b652b5dc3610e197a823abcde758ca10a3c44743d880380be941d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subdocs.sty \
texlive-subdocs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
