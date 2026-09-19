SUMMARY = "Utility macro: peek ahead without ignoring spaces"
DESCRIPTION = "The package deals with the behaviour of the LaTeX internal \
command \\@ifnextchar, which skips blank spaces. This has the \
potential to surprise users, since it can produce really \
unwanted effects. A common example occurs with brackets \
starting a line following \\\\: the command looks for an optional \
argument, whereas the user wants the brackets to be printed. \
The package offers commands and options for modifying this \
behaviour, maybe limited to certain parts of the document \
source."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn23379"

RPM_NAME = "texlive-ifnextok-2026.226.0.0.3svn23379-60.2.noarch.rpm"
RPM_HASH = "87a992703765a9460e1f44712be940efc894403362873f6458aa24f4854e90d7d840235972c5bcf6e0b56e38bf89f77b6804e33b67153d5030d4d9ee9a220e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifnextok.sty \
texlive-ifnextok"

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
