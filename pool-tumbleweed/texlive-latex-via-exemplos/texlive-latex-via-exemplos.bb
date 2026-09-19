SUMMARY = "A LaTeX course written in Brazilian Portuguese language"
DESCRIPTION = "This is a LaTeX2e course written in Brazilian Portuguese \
language."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77105"

RPM_NAME = "texlive-latex-via-exemplos-2026.226.svn77105-63.2.noarch.rpm"
RPM_HASH = "82a9e01f25c631ef4e7abcbfb069d6b75616eb913794efdf6f885094889ac44f2d1ac82420c3a966152ca41d85dfd1daa6ceabff2305549662a82f82d31659bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-via-exemplos"

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
