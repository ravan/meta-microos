SUMMARY = "Extended verbatim"
DESCRIPTION = "A collection of verbatim facilities that provide line-numbered \
verbatim, verbatim that obeys TAB characters, verbatim input \
and verbatim output to file. The package makes use of the LaTeX \
required verbatim package. The package is formed from a series \
of small pieces, and is somewhat unstructured. The user who \
looks for thought-through verbatim facilities is advised to \
consider using the fancyvrb package in place of moreverb."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3asvn77682"

RPM_NAME = "texlive-moreverb-2026.226.2.3asvn77682-61.2.noarch.rpm"
RPM_HASH = "4f2f8c06fef0129c5686944599b77d7be47fcf7f9497b2550d2e5a3cfca17c6083b8165f7e8507f4a871dc8e7ea9e638e730af22f4c3a7464bcdbe25fd9e7939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moreverb.sty \
texlive-moreverb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
