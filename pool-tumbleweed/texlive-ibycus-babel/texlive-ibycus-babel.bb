SUMMARY = "Use the Ibycus 4 Greek font with Babel"
DESCRIPTION = "The package allows you to use the Ibycus 4 font for ancient \
Greek with Babel. It uses a Perl script to generate hyphenation \
patterns for Ibycus from those for the ordinary Babel encoding, \
cbgreek. It sets up ibycus as a pseudo-language you can specify \
in the normal Babel manner. For proper hyphenation of Greek \
quoted in mid-paragraph, you should use it with elatex (all \
current distributions of LaTeX are built with e-TeX, so the \
constraint should not be onerous)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn15878"

RPM_NAME = "texlive-ibycus-babel-2026.226.3.0svn15878-60.2.noarch.rpm"
RPM_HASH = "98a612b7e771d139404fc2472fc8dc9bfbf10f37c9db4d9f83a4c942b86ff903893fdde1336d001afa4c387e48a92632e0c8d4d043292de4df00c52d71b58637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ibycus.ldf \
tex-lgienc.def \
tex-lgifib.fd \
texlive-ibycus-babel"

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
