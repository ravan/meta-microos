SUMMARY = "Invoke bash commands from within LaTeX"
DESCRIPTION = "The package makes it possible to execute Unix bash shell \
scripts from within LaTeX. The main application is in writing \
computer-science texts, in which you want to make sure the \
programs listed in the document are executed directly from the \
input. The package may use other Unix shells than bash, but \
does not work without modification in a Windows environment. \
The package requires the -shell-escape flag when LaTeX is \
processing your document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.93svn25597"

RPM_NAME = "texlive-bashful-2026.226.0.0.93svn25597-60.2.noarch.rpm"
RPM_HASH = "8b56460539b2d82e701d4b5e9a2afdc41d88f52906c99a5a0720fce2aeedeaae6de4f67dddfdf763ee4e9eeb708616c5c5aadc0e27288d82b51170114c50f2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bashful.sty \
texlive-bashful"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-listings.sty \
tex-textcomp.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
