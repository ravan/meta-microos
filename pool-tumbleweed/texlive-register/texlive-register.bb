SUMMARY = "Typeset programmable elements in digital hardware (registers)"
DESCRIPTION = "This package is designed for typesetting the programmable \
elements in digital hardware, i.e., registers. Such registers \
typically have many fields and can be quite wide; they are thus \
a challenge to typeset in a consistent manner. Register is \
similar in some aspects to the bytefield and bitpattern \
packages. Anyone doing hardware documentation using LaTeX \
should examine those packages. Register requires version \
2001/07/25 or newer of the float package. An example Perl \
module and script are provided, to convert the register \
specifications into structures suitable for, say, a pre-silicon \
test environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn54485"

RPM_NAME = "texlive-register-2026.226.2.0svn54485-60.4.noarch.rpm"
RPM_HASH = "7403ca37ba27ea9b7784f1d4437ee82c4ba9af28fc9e693c8213e2c744ba883fec160e1a0e215b8451337abca2ca1b1e13298bcdc92530d579731bd62a7b9ffd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-register.sty \
texlive-register"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-float.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
