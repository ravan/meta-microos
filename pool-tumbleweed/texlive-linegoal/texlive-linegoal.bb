SUMMARY = "A 'dimen' that returns the space left on the line"
DESCRIPTION = "The linegoal package provides a macro \\linegoal to be used with \
\\setlength: \\setlength<some dimen>\\linegoal will set <some \
dimen> to the horizontal length of the remainder of the line. \
This is achieved using the \\pdfsavepos primitive of pdfTeX, \
through the zref-savepos package. Example: Some text: \
\\begin{tabularx}\\linegoal{|l|X|} \\hline one & two \\\\ three & \
four \\\\\\hline \\end{tabularx} will position the table after the \
initial text, and make the table fill the rest of the line."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn21523"

RPM_NAME = "texlive-linegoal-2026.226.2.9svn21523-61.2.noarch.rpm"
RPM_HASH = "80ff3ac08c24701d5e9d86711633fe84877e92375aa0497f13cac741f78bc45ad8744ad73c4ada7f618a7c7bffef28ac7ac75748649869ac80d74709f65e9be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linegoal.sty \
texlive-linegoal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-zref-savepos.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
