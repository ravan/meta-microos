SUMMARY = "Case conversion ignoring mathematics, etcetera"
DESCRIPTION = "The textcase package offers commands \\MakeTextUppercase and \
\\MakeTextLowercase which are similar to the standard \
\\MakeUppercase and \\MakeLowercase, but they do not change the \
case of any sections of mathematics, or the arguments of \\cite, \
\\label and \\ref commands within the argument. A further command \
\\NoCaseChange does nothing but suppress case change within its \
argument, so to force uppercase of a section including an \
environment, one might say: \
\\MakeTextUppercase{...\\NoCaseChange{\\begin{foo}} \
...\\NoCaseChange{\\end{foo}}...} In current LaTeX this package \
is obsolete. You can use the standard \\MakeUppercase and \
\\MakeLowercase, but it defines legacy names \\MakeTextUppercase \
and \\MakeTextLowercase."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.05svn77682"

RPM_NAME = "texlive-textcase-2026.227.1.05svn77682-62.2.noarch.rpm"
RPM_HASH = "901ee442355ac3db726298cb8133bbf0e734b3182ab159b26434cef299a44623b2772b54324d276f239f50512cc32c1c2cee85e0f03b4b26586a00475162a45d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textcase.sty \
texlive-textcase"

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
