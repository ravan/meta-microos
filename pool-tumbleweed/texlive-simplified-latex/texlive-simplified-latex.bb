SUMMARY = "A Simplified Introduction to LaTeX"
DESCRIPTION = "An accessible introduction for the beginner."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20620"

RPM_NAME = "texlive-simplified-latex-2026.226.svn20620-64.2.noarch.rpm"
RPM_HASH = "50b655cc0a36e7531ded5589fd0f434e5a2b4a9a7364fd725d202546968a694a543dcb02128a8e3ed9d909f4d23b07df540f4e24b61f8a32904696ca6c156cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplified-latex"

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
