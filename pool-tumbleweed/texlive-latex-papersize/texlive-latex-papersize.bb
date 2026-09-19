SUMMARY = "Calculate LaTeX settings for any font and paper size"
DESCRIPTION = "The package is a Python script, whose typical use is when \
preparing printed material for users with low vision. The most \
effective way of doing this is to print on (notional) small \
paper, and then to magnify the result; the script calculates \
the settings for various font and paper sizes. More details are \
to be read in the script itself."
LICENSE = "Apache-1.0"

PV = "2026.226.1.63svn53131"

RPM_NAME = "texlive-latex-papersize-2026.226.1.63svn53131-63.2.noarch.rpm"
RPM_HASH = "c0df4ee4ce75d378605ac2f27cede1741e9a6723f465c95390a18ad71b8320bf1d43dcbebaeb64d15f4690b8c1bd8054fce4c94f43b709c0c67eb7b388d81ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-papersize"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex-papersize-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
