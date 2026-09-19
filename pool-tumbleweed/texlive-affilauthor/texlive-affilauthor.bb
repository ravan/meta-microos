SUMMARY = "Tag author and affiliation information in a key-value style"
DESCRIPTION = "This package provides key-value style author and affiliation \
information tagging in a structured format. Each field has a \
specific name similar to the bib format. We can customize the \
styles as per preferences for article.cls class layout. Instead \
of giving all the information (author and affiliation) in a \
single tag, we can split the information in a format of \
key-value style."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-affilauthor-2026.226.1.0.1svn76924-61.2.noarch.rpm"
RPM_HASH = "eba5c09f70f7821fcef0e34b342f76c70a4e91976ddbd2d951c84605759eee3ded0f20295f427b9aa580b2495c400e1b32dbfaba5ee6572cf9f34e4399379992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-affilauthor.sty \
texlive-affilauthor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-marvosym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
