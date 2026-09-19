SUMMARY = "Create and manipulate lists of symbols"
DESCRIPTION = "Listofsymbols provides commands to automatically create a list \
of symbols (also called notation or nomenclature), and to \
handle symbols logically, i.e. define a macro that is expanded \
to the desired output and use the macro in the text rather than \
`hardcoding' the output into the text. This helps to ensure \
consistency throughout the text, especially if there is a \
chance that symbols will be changed at some stage. The package \
is more or less a combination of what the packages nomencl and \
formula do. The concept of creating the list of symbols, \
though, is different from the way nomencl.sty does it."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn16134"

RPM_NAME = "texlive-listofsymbols-2026.226.0.0.2svn16134-61.2.noarch.rpm"
RPM_HASH = "91ec34bc8f20afe9a23fe02b43073055b1668d5cf6570bc2ff353317f85d5b0494a8f3efae0fbaba0c138c10c98aada9c87d7385e9883a26c3f47785a89ee023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listofsymbols.sty \
texlive-listofsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-nomencl.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
