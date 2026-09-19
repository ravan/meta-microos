SUMMARY = "Keeping track of document versions"
DESCRIPTION = "The package enables the user to keep track of different \
versions of a LaTeX document. The command \\version prints the \
version and build numbers; each time you compile your document, \
the build number is increased by one. By placing \\version in \
the header or footer, each page can be marked with the unique \
build number describing the progress of your document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn29370"

RPM_NAME = "texlive-mversion-2026.226.1.0.1svn29370-61.2.noarch.rpm"
RPM_HASH = "b55272d39a0045ebf16bbf1aa17a6bbfb68749372fc2fe304b8aba83b91137c7505e2eee988640d6d8970b162a7dfd0fe6b4c34949d2e1cfe99f01ad8a20dceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mVersion.sty \
texlive-mversion"

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
