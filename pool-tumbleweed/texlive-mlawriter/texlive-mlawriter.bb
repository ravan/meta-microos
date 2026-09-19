SUMMARY = "Write MLA style documents in Plain TeX"
DESCRIPTION = "With this Plain TeX extension, papers can be written in MLA \
style. These appear as if they were written in MS Word."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn67558"

RPM_NAME = "texlive-mlawriter-2026.226.1.1.0svn67558-61.2.noarch.rpm"
RPM_HASH = "cc88c78e716c078bb491f3885844e615077664f7f4753ba515060852569857f686afe524ba04838582bcd53af38946d2773a7201cd74661b69e47732aa34d9d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mlawriter.tex \
texlive-mlawriter"

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
