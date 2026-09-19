SUMMARY = "Counter operations with label references"
DESCRIPTION = "Provides commands \\setcounterref and \\addtocounterref which use \
the section (or whatever) number from the reference as the \
value to put into the counter, as in: ...\\label{sec:foo} ... \
\\setcounterref{foonum}{sec:foo} Commands \\setcounterpageref and \
\\addtocounterpageref do the corresponding thing with the page \
reference of the label. No .ins file is distributed; process \
the .dtx with plain TeX to create one."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn77682"

RPM_NAME = "texlive-refcount-2026.226.3.6svn77682-60.4.noarch.rpm"
RPM_HASH = "8b9322631b61f04bdda4bccdf6b3f0adb7f86af0594e6ff015de84ef41e3d0cf0a4cba6ae7770cdaa24ecf00c1acb0d1b79f012f88f19b4e81004122d667cfda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refcount.sty \
texlive-refcount"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
