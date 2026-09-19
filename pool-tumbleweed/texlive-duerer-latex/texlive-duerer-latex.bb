SUMMARY = "LaTeX support for the Duerer fonts"
DESCRIPTION = "LaTeX support for Hoenig's Computer Duerer fonts, using their \
standard fontname names."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-duerer-latex-2026.226.1.1svn15878-59.2.noarch.rpm"
RPM_HASH = "35be59f8120447cfb9c0a6591b95026ff59c90944282fca67cb3d1326a3724180926d006f64d118e3691d3962a38b5aa12b16f4507124af0adc7c94230e77f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duerer.sty \
tex-ot1cdin.fd \
tex-ot1cdr.fd \
tex-ot1cdss.fd \
tex-ot1cdtt.fd \
texlive-duerer-latex"

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
