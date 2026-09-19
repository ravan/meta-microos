SUMMARY = "Commands to typeset recursion theory papers"
DESCRIPTION = "This package is designed to help mathematicians publishing \
papers in the area of recursion theory (aka Computability \
Theory) easily use standard notation. This includes easy \
commands to denote Turing reductions, Turing functionals, c.e. \
sets, stagewise computations, forcing and syntactic classes."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.5svn76924"

RPM_NAME = "texlive-rec-thy-2026.226.4.5svn76924-60.4.noarch.rpm"
RPM_HASH = "bee0e360bc7432953338367c815f5c8ef58ef091ebdd0b43b1112b7000b496e4b164e9b48c862756448c79629007eb0ba25c6332fef6ceb9a999afb7f0e9c750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rec-thy.sty \
texlive-rec-thy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-bbm.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-ifmtarg.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ltxcmds.sty \
tex-mathrsfs.sty \
tex-pict2e.sty \
tex-picture.sty \
tex-suffix.sty \
tex-unicode-math.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
