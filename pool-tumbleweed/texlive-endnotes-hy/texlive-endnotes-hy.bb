SUMMARY = "Patches the endnotes package to create hypertext links to the correct anchors"
DESCRIPTION = "The package supports the creation of hypertext links in support \
of the endnotes package. The package modifies the syntax of the \
\\endnote command: \\endnote*[<num>]{<text>}\\label{<name>}. When \
the *-option is used, no endnote mark is created, but the \
endnote itself is written. The \\label command appears at the \
end of the \\endnote and its arguments, rather than within the \
argument of the <text> argument."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54758"

RPM_NAME = "texlive-endnotes-hy-2026.226.svn54758-61.4.noarch.rpm"
RPM_HASH = "9cf5c6964a48db7c73dda6921364f92aef16ff1a4910fccd098ca12fe0730bb519c7a6f480124debcbbcaa826f786998400d4621537228dffe409eb11d1eca6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endnotes-hy.sty \
texlive-endnotes-hy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-endnotes.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
