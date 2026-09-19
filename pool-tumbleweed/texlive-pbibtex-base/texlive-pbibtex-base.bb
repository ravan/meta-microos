SUMMARY = "Bibliography styles and miscellaneous files for pBibTeX"
DESCRIPTION = "These are miscellaneous files, including bibliography styles \
(.bst), for pBibTeX, which is a Japanese extended version of \
BibTeX contained in TeX Live. The bundle is a redistribution \
derived from the ptex-texmf distribution by ASCII MEDIA WORKS."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn66085"

RPM_NAME = "texlive-pbibtex-base-2026.226.svn66085-58.2.noarch.rpm"
RPM_HASH = "aaa5b0ffa4139beccadf3836cde0179ef2093fb02a63c645c72045634d0a6d7a94f5844bbdd39d4eaa23ed5cafd53e00594d14187ab338bedd2ebee6c7ff3f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbibtex-base"

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
